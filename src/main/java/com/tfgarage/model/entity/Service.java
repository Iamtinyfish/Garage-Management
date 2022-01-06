package com.tfgarage.model.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "service")
@Getter
@Setter
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private float price;

	@Column(name = "status", length = 25)
	private String status;

	@OneToMany(mappedBy = "service")
	private List<UsedService> usedServices;

	@Transient
	private float totalRevenue;
}