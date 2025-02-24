package com.autocare.repository;

import com.autocare.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentsRepo extends JpaRepository<Appointments, Integer> {

}
