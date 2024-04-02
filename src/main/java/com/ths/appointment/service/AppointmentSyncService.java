package com.ths.appointment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ths.appointment.entity.AppointmentSync;
import com.ths.appointment.repository.AppointmentSyncRepository;


@Service
public class AppointmentSyncService {

    @Autowired
    private AppointmentSyncRepository appointmentSyncRepository;

    public AppointmentSync createAppointmentSync(AppointmentSync appoitnmentSync) {
        return appointmentSyncRepository.save(appoitnmentSync);
    }

    public List<AppointmentSync> getAllAppoitnmentSyncs() {
        return appointmentSyncRepository.findAll();
    }

    public AppointmentSync getAppointmentSyncById(Long id) {
        return appointmentSyncRepository.findById(id).orElse(null);
    }

    public AppointmentSync updateAppointmentSync(Long id, AppointmentSync appoitnmentSync) {
        appoitnmentSync.setPatientAppointmentId(id);
        return appointmentSyncRepository.save(appoitnmentSync);
    }

    public void deleteAppointmentSync(Long id) {
    	appointmentSyncRepository.deleteById(id);
    }
}