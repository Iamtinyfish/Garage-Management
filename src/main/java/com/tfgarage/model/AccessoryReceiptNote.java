package com.tfgarage.model;

import java.util.Date;
import java.util.List;

public class AccessoryReceiptNote {

	private int id;
	private List<ReceivedAccessory> receivedAccessories;
	private float totalCost;
	private Date receiptDay;
	private Employee employee;
	private Provider provider;
	private String note;

	public AccessoryReceiptNote() {
	}

	public AccessoryReceiptNote(int id, List<ReceivedAccessory> receivedAccessories, float totalCost, Date receiptDay, Employee employee, Provider provider, String note) {
		this.id = id;
		this.receivedAccessories = receivedAccessories;
		this.totalCost = totalCost;
		this.receiptDay = receiptDay;
		this.employee = employee;
		this.provider = provider;
		this.note = note;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ReceivedAccessory> getReceivedAccessories() {
		return receivedAccessories;
	}

	public void setReceivedAccessories(List<ReceivedAccessory> receivedAccessories) {
		this.receivedAccessories = receivedAccessories;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public Date getReceiptDay() {
		return receiptDay;
	}

	public void setReceiptDay(Date receiptDay) {
		this.receiptDay = receiptDay;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}