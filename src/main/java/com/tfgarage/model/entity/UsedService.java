package com.tfgarage.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usedservice")
@Getter
@Setter
public class UsedService{
	@EmbeddedId
	private UsedServiceKey id;

	@ManyToOne
	@MapsId("billID")
	@JoinColumn(name = "BillID")
	private Bill bill;

	@ManyToOne
	@MapsId("serviceID")
	@JoinColumn(name = "ServiceID")
	private Service service;

	@Column(name = "amount", nullable = false)
	private int amount;

	@Column(name = "price", nullable = false)
	private float price;

	@Column(name = "note")
	private String note;
}