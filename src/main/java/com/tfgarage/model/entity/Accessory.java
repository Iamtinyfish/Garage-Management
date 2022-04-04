package com.tfgarage.model.entity;

import com.tfgarage.model.entity.utils.AccessoryStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "accessory")
@Getter
@Setter
public class Accessory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "unit", length = 25)
	private String unit;

	@Column(name = "stock", nullable = false)
	private int stock;

	@Column(name = "receivedCost")
	private float receivedCost;

	@Column(name = "price")
	private float price;

	@Column(name = "status", length = 25)
	@Enumerated(EnumType.STRING)
	private AccessoryStatus status;

	@OneToMany(mappedBy = "accessory")
	private Set<UsedAccessory> usedAccessories;

	@OneToMany(mappedBy = "accessory")
	private Set<ReceivedAccessory> receivedAccessories;

	@Transient
	private float totalRevenue;
}