package com.tfgarage.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "account")
@Getter
@Setter
@ToString
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@NaturalId
	@Column(name = "username", nullable = false, unique = true)
	private String username;

	@Column(name = "password", length = 32, nullable = false)
	private String password;

	@Column(name = "role", length = 25, nullable = false)
	private String role;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "EmployeeID")
	private Employee employee;
}
