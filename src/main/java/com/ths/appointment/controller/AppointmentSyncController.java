package com.ths.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ths.appointment.entity.AppointmentSync;
import com.ths.appointment.service.AppointmentSyncService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentSyncController {
	@Autowired
    private AppointmentSyncService appointmentSyncService;

	// get all appointments
	@GetMapping
	public List<AppointmentSync> getAllAppointmentSync() {
		return appointmentSyncService.getAllAppoitnmentSyncs();
	}

	// get appoitnmentSync by id
	@GetMapping("/{patient_appointment_id}")
	    public AppointmentSync getAppointmentById(@PathVariable(value = "patient_appointment_id") Long appointmentId) {
	        return this.appointmentSyncService.getAppointmentSyncById(appointmentId);
	    }

	// create appointment
	@PostMapping
	public AppointmentSync createAppointment(@RequestBody AppointmentSync appointmentSync) {
		return this.appointmentSyncService.createAppointmentSync(appointmentSync);
	}

	// update appointment
	@PutMapping("/{patient_appointment_id}")
	public AppointmentSync updateAppointment(@RequestBody AppointmentSync appointmentSync, @PathVariable("patient_appointment_id") Long appointmentId) {
		return appointmentSyncService.updateAppointmentSync(appointmentId, appointmentSync);
	}

	// delete appointment by id
	@DeleteMapping("/{patient_appointment_id}")
	public void deleteAppointment(@PathVariable("patient_appointment_id") Long appointmentId) {
		appointmentSyncService.deleteAppointmentSync(appointmentId);
	}
}
