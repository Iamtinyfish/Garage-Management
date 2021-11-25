package com.tfgarage.model;

public class AccessoryStat extends Accessory {

	private float totalRevenue;

	public AccessoryStat() {
	}

	public AccessoryStat(int id, String name, int stock, float receivedPrice, String description, float price, String unit, float totalRevenue) {
		super(id, name, stock, receivedPrice, description, price, unit);
		this.totalRevenue = totalRevenue;
	}

	public float getTotalRevenue() {
		return totalRevenue;
	}

	public void setTotalRevenue(float totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
}