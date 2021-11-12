package com.tfgarage.model;

public class CustomerStat extends Customer {
    private float totalRevenue;

    public CustomerStat() {
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
