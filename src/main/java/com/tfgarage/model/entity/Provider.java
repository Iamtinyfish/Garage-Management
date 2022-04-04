package com.tfgarage.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "provider")
@Getter
@Setter
public class Provider {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "ID", nullable = false ,unique = true)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "phone", nullable = false, length = 25)
	private String phone;

	@Column(name = "email")
	@Email
	private String email;

	@Column(name = "note")
	private String note;

	@OneToMany(mappedBy = "provider")
	private Set<AccessoryReceiptNote> accessoryReceiptNotes;

	@Transient
	private int amountReceived;
}