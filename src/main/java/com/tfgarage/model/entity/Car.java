package com.tfgarage.model.entity;

import com.tfgarage.model.entity.utils.CarStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "car")
@Getter
@Setter
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "licensePlate", nullable = false ,unique = true)
	private String licensePlate;

	@Column(name = "type")
	private String type;

	@Column(name = "status", nullable = false, length = 25)
	@Enumerated(EnumType.STRING)
	private CarStatus status;

	@Column(name = "note")
	private String note;

	@ManyToOne
	@JoinColumn(name = "CustomerID")
	private Customer customer;

	@OneToMany(mappedBy = "car")
	private Set<Bill> bills;
}