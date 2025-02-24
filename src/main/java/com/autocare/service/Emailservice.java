package com.autocare.service;

import jakarta.mail.MessagingException;

public interface Emailservice {

    public void Send(String to, String subject, String text);

    public void registeration(String tomail , String customername) throws MessagingException;
    public void sendAppointmentEmail(String toEmail, String customerName, String appointmentDate, String appointmentLocation) throws MessagingException;

}
