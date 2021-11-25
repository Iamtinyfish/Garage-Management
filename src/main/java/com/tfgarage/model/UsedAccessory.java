package com.tfgarage.model;

public class UsedAccessory {

	private int amount;
	private Accessory accessory;
	private float price;
	private String note;

	public UsedAccessory() {

	}

	public UsedAccessory(int amount, Accessory accessory, float price, String note) {
		this.amount = amount;
		this.accessory = accessory;
		this.price = price;
		this.note = note;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Accessory getAccessory() {
		return accessory;
	}

	public void setAccessory(Accessory accessory) {
		this.accessory = accessory;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}