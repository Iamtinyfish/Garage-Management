package com.tfgarage.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usedaccessory")
@Getter
@Setter
public class UsedAccessory {
	@EmbeddedId
	UsedAccessoryKey id;

	@ManyToOne
	@MapsId("billID")
	@JoinColumn(name = "BillID")
	private Bill bill;

	@ManyToOne
	@MapsId("accessoryID")
	@JoinColumn(name = "AccessoryID")
	private Accessory accessory;

	@Column(name = "amount", nullable = false)
	private int amount;

	@Column(name = "price", nullable = false)
	private float price;

	@Column(name = "note")
	private String note;
}