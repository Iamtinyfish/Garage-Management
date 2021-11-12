package com.tfgarage.model;

public class AccessoryStat extends Accessory {
    private float totalRevenue;

    public AccessoryStat() {
    }

    public AccessoryStat(int id, String name, float receivedPrice, float price,
                         String description, int stock, float totalRevenue) {
        super(id, name, receivedPrice, price, description, stock);
        this.totalRevenue = totalRevenue;
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
