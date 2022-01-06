package com.tfgarage.model.entity;

import com.tfgarage.model.entity.utils.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

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

	@Column(name = "note")
	private String note;

	@OneToOne(mappedBy = "employee")
	private Account account;
}