package com.tfgarage.model;

public class Accessory {

	private int id;
	private String name;
	private int stock;
	private float receivedPrice;
	private String description;
	private float price;
	private String unit;

	public Accessory() {
	}

	public Accessory(int id, String name, int stock, float receivedPrice, String description, float price, String unit) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.receivedPrice = receivedPrice;
		this.description = description;
		this.price = price;
		this.unit = unit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getReceivedPrice() {
		return receivedPrice;
	}

	public void setReceivedPrice(float receivedPrice) {
		this.receivedPrice = receivedPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}