package com.tfgarage.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "accessoryreceiptnote")
@Getter
@Setter
public class AccessoryReceiptNote {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@OneToMany(mappedBy = "accessoryReceiptNote", fetch = FetchType.EAGER)
	private List<ReceivedAccessory> receivedAccessories;

	@Column(name = "totalCost", nullable = false)
	private float totalCost;

	@Column(name = "receivedDay", nullable = false)
	@PastOrPresent
	private LocalDate receiptDay;

	@Column(name = "note")
	private String note;

	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "ProviderID")
	private Provider provider;
}