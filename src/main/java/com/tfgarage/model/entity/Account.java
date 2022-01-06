package com.tfgarage.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "password", length = 32, nullable = false)
	private String password;

	@Column(name = "salt", length = 8, nullable = false)
	private String salt;

	@Column(name = "position", length = 25, nullable = false)
	private String position;

	@Column(name = "status", length = 25, nullable = false)
	private String status;

	@OneToOne
//	@JoinColumn(name = "EmployeeID")
	private Employee employee;
}
