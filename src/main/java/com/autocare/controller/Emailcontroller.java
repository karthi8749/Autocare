package com.autocare.controller;

import com.autocare.entity.Appointments;
import com.autocare.entity.Customers;
import com.autocare.repository.AppointmentsRepo;
import com.autocare.repository.Emailrepo;
import com.autocare.service.Emailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emails")

public class Emailcontroller {

    @Autowired
    private Emailrepo emailrepo;

    @Autowired
    private Emailservice emailservice;

    @Autowired
    private AppointmentsRepo appointments;

    @GetMapping("/sendEmails")
    public ResponseEntity<?> sendEmailsToAllCustomers() {

        List<Customers> customers = emailrepo.findAll();  // Fetch customers from DB
        String subject = "Important Notification";
        String text = "Dear Customer, \n\nHappy Pongal ";

        try {
            for (Customers customer : customers) {
                emailservice.Send(customer.getEmail(), subject, text);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.ok("Emails sent successfully to all customers!");
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Map<String, String> requestBody) {
        // Store registration in the database (using AppointmentService)
//        appointmentService.saveCustomerRegistration(email, customerName);

        // Send registration success email
        String email = requestBody.get("email");
        String customerName = requestBody.get("customerName");
        try {
            emailservice.registeration(email, customerName);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error sending registration email");
            // Handle email sending failure
        }

        return ResponseEntity.ok("registrationSuccess");
    }

    @PostMapping("/book-appointment")
    public ResponseEntity<?> bookAppointment(@RequestBody Map<String, String> requestBody) {
        // Save appointment in the database
        String email = requestBody.get("email");
        String name = requestBody.get("name");
        String appointmentDate = requestBody.get("appointmentDate");
        String appointmentLocation = requestBody.get("appointmentLocation");


        Appointments appointment = new Appointments();
        appointment.setEmail(email);
        appointment.setName(name);

        appointments.save(appointment);

        // Send appointment confirmation email
        try {
            emailservice.sendAppointmentEmail(email, name, appointmentDate, appointmentLocation);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error sending registration email");
            // Handle email sending failure
        }

        return ResponseEntity.ok("appointmentSuccess");
    }


}
