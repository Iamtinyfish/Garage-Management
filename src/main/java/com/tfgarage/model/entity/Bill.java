package com.tfgarage.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "bill")
@Getter
@Setter
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@OneToMany(mappedBy = "bill")
	private List<UsedService> usedServices;

	@OneToMany(mappedBy = "bill")
	private List<UsedAccessory> usedAccessories;

	@Column(name = "totalPrice", nullable = false)
	private float totalPrice;

	@Column(name = "status", nullable = false, length = 25)
	private String status;

	@Column(name = "startDay", nullable = false)
	@PastOrPresent
	private LocalDate startDay;

	@Column(name = "latestEditDay", nullable = false)
	@PastOrPresent
	private LocalDate lastestEditDay;

	@Column(name = "paymentDay")
	@PastOrPresent
	private LocalDate paymentDay;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employee employee;

	@ManyToMany(targetEntity = Employee.class)
	@JoinTable(
		name = "technicianassignment",
		joinColumns = @JoinColumn(name = "BillID"),
		inverseJoinColumns = @JoinColumn(name = "EmployeeID")
	)
	private List<Employee> technicians;

	@ManyToOne
	@JoinColumn(name = "CarID")
	private Car car;

	@Column(name = "note")
	private String note;
}