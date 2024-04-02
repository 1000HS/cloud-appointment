package com.ths.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ths.appointment.entity.AppointmentSync;


@Repository
public interface AppointmentSyncRepository extends JpaRepository<AppointmentSync, Long> {

}
