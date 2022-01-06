package com.tfgarage.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "receivedaccessory")
@Getter
@Setter
public class ReceivedAccessory {
	@EmbeddedId
	ReceivedAccessoryKey id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("accessoryReceiptNoteID")
	@JoinColumn(name = "AccessoryReceiptNoteID")
	private AccessoryReceiptNote accessoryReceiptNote;

	@ManyToOne
	@MapsId("accessoryID")
	@JoinColumn(name = "AccessoryID")
	private Accessory accessory;

	@Column(name = "amount", nullable = false)
	private int amount;

	@Column(name = "receivedCost", nullable = false)
	private float receivedCost;

	@Column(name = "note")
	private String note;
}