package com.tfgarage.model;

public class ReceivedAccessory {

	private int amount;
	private Accessory accessory;
	private float receivedPrice;
	private String note;

	public ReceivedAccessory() {
	}

	public ReceivedAccessory(int amount, Accessory accessory, float receivedPrice, String note) {
		this.amount = amount;
		this.accessory = accessory;
		this.receivedPrice = receivedPrice;
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

	public float getReceivedPrice() {
		return receivedPrice;
	}

	public void setReceivedPrice(float receivedPrice) {
		this.receivedPrice = receivedPrice;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}