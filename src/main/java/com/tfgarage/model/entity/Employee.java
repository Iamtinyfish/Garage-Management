package com.tfgarage.model.entity;

import com.tfgarage.model.entity.utils.EmployeeStatus;
import com.tfgarage.model.entity.utils.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Getter
@Setter
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "position", length = 25, nullable = false)
	private String position;

	@Column(name = "birthday", nullable = false)
	@Past
	private LocalDate birthday;

	@Transient
	private int age;

	@Column(name = "gender", nullable = false, length = 25)
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone", nullable = false, length = 25)
	private String phone;

	@Column(name = "email")
	@Email
	private String email;

	@Column(name = "idCard", nullable = false, unique = true, length = 12)
	private String idCard;

	@Column(name = "status", nullable = false, length = 25)
	@Enumerated(EnumType.STRING)
	private EmployeeStatus status;

	@Column(name = "note")
	private String note;

	@OneToOne(mappedBy = "employee")
	private Account account;
}