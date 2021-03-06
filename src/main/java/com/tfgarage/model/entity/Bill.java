package com.tfgarage.model.entity;

import com.tfgarage.model.entity.utils.BillStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "bill")
@Getter
@Setter
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@OneToMany(mappedBy = "bill", fetch = FetchType.EAGER)
	private Set<UsedService> usedServices;

	@OneToMany(mappedBy = "bill", fetch = FetchType.EAGER)
	private Set<UsedAccessory> usedAccessories;

	@Column(name = "totalPrice", nullable = false)
	private float totalPrice;

	@Column(name = "status", nullable = false, length = 25)
	@Enumerated(EnumType.STRING)
	private BillStatus status;

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

	@ManyToMany(targetEntity = Employee.class, fetch = FetchType.EAGER)
	@JoinTable(
		name = "technicianassignment",
		joinColumns = @JoinColumn(name = "BillID"),
		inverseJoinColumns = @JoinColumn(name = "EmployeeID")
	)
	private Set<Employee> technicians;

	@ManyToOne
	@JoinColumn(name = "CarID")
	private Car car;

	@Column(name = "note")
	private String note;
}