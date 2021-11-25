package com.tfgarage.model;

import java.util.List;

public class Car {
	private int id;
	private String licensePlate;
	private String type;
	private List<Bill> bills;

	public Car() {
	}

	public Car(int id, String licensePlate, String type, List<Bill> bills) {
		this.id = id;
		this.licensePlate = licensePlate;
		this.type = type;
		this.bills = bills;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}
}