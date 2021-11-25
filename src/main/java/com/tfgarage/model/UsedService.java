package com.tfgarage.model;

public class UsedService {

	private int amount;
	private float price;
	private Service service;
	private String note;

	public UsedService() {
	}

	public UsedService(int amount, float price, Service service, String note) {
		this.amount = amount;
		this.price = price;
		this.service = service;
		this.note = note;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}