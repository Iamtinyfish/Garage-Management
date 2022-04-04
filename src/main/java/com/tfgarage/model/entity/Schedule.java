package com.tfgarage.model.entity;

import com.tfgarage.model.entity.utils.ScheduleStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "schedule")
@Getter
@Setter
public class Schedule {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "customerName", nullable = false)
	private String customerName;

	@Column(name = "phone", nullable = false, length = 25)
	private String phone;

	@Column(name = "email")
	@Email
	private String email;

	@Column(name = "scheduleDay", nullable = false)
	private LocalDate scheduleDay;

	@Column(name = "status", nullable = false, length = 25)
	@Enumerated(EnumType.STRING)
	private ScheduleStatus status;

	@Column(name = "note")
	private String note;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employee employee;

//	private Customer customer;
}