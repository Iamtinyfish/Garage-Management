package com.tfgarage.model.entity;


import com.tfgarage.model.entity.utils.ServiceStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

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
	@Enumerated(EnumType.STRING)
	private ServiceStatus status;

	@OneToMany(mappedBy = "service")
	private Set<UsedService> usedServices;

	@Transient
	private float totalRevenue;
}