package com.ths.appointment.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "appointment_sync")
public class AppointmentSync {
	
	@Id
	@Column(name = "patient_appointment_id")
    private Long patientAppointmentId;
	
	@Column(name = "identifier")
    private String identifier;

    @Column(name = "phone")
    private String phone;

    @Column(name = "names")
    private String names;
	
	@Column(name = "start_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime startDate;
	
	@Column(name = "end_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime endDate;
	
	@Column(name = "gender")
	private String gender;

	@Column(name = "location")
	private String location;

	@Column(name = "parent_location")
	private String parentLocation;
	
	@Column(name = "comments")
	private String comment;
	
	@Column(name = "status")
	private String status;
	@Column(name = "last_updated", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastUpdated;
	
	public AppointmentSync() {}

	public AppointmentSync(Long patientAppointmentId, String identifier, String phone, String names, LocalDateTime startDate, LocalDateTime endDate, String gender,
			String location, String parentLocation, String comment, String status, LocalDateTime lastUpdated) {
		super();
		this.patientAppointmentId = patientAppointmentId;
		this.identifier = identifier;
		this.phone = phone;
		this.names = names;
		this.startDate = startDate;
		this.endDate = endDate;
		this.gender = gender;
		this.location = location;
		this.parentLocation = parentLocation;
		this.comment = comment;
		this.status = status;
		this.lastUpdated = lastUpdated;
	}

	public Long getPatientAppointmentId() {
		return patientAppointmentId;
	}
	public void setPatientAppointmentId(Long patientAppointmentId) {
		this.patientAppointmentId = patientAppointmentId;
	}

	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getParentLocation() {
		return parentLocation;
	}
	public void setParentLocation(String parentLocation) {
		this.parentLocation = parentLocation;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
