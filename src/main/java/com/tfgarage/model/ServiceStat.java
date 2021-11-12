package com.tfgarage.model;

public class ServiceStat extends Service {
    private float totalRevenue;

    public ServiceStat() {
    }

    public ServiceStat(int id, String name, double price, String description, float totalRevenue) {
        super(id, name, price, description);
        this.totalRevenue = totalRevenue;
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
