package com.autocare.service;

import com.autocare.repository.Emailrepo;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
@Component
public class EmailserviceImp implements com.autocare.service.Emailservice {

    @Autowired
    private Emailrepo emailrepo;

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public void Send(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("vijayanthony28667@gmail.com");  // Sender's email
        message.setTo(to);                              // Receiver's email
        message.setSubject(subject);
        message.setText(text);

        emailSender.send(message);
    }

    @Override
    public void registeration(String tomail, String customerName) throws MessagingException{
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, StandardCharsets.UTF_8.name());

        helper.setFrom("vijayanthony28667@gmail.com");
        helper.setTo(tomail);
        helper.setSubject("Registration Successful");
        String body = "<html><body>" +
                "<h2>Dear " + customerName + ",</h2>" +
                "<p>You have successfully registered with us. Thank you for joining our platform.</p>" +
                "<p>Best regards,<br>Your Company Team</p>" +
                "</body></html>";
        helper.setText(body, true);

        emailSender.send(message);
    }

    public void sendAppointmentEmail(String toEmail, String customerName, String appointmentDate, String appointmentLocation) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, StandardCharsets.UTF_8.name());

        helper.setFrom("vijayanthony28667@gmail.com");
        helper.setTo(toEmail);
        helper.setSubject("Appointment Successfully Booked");
        String body = "<html><body>" +
                "<h2>Dear " + customerName + ",</h2>" +
                "<p>You have successfully booked an appointment with us.</p>" +
                "<p><strong>Appointment Details:</strong></p>" +
                "<ul>" +
                "<li><strong>Date:</strong> " + appointmentDate + "</li>" +
                "<li><strong>Location:</strong> " + appointmentLocation + "</li>" +
                "</ul>" +
                "<p>We look forward to meeting you.</p>" +
                "<p>Best regards,<br>Your Company Team</p>" +
                "</body></html>";
        helper.setText(body, true);

        emailSender.send(message);
    }


}
