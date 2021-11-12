package com.tfgarage.model;

public class UsedService {
    private Service service;
    private int amount;
    private float price;

    public UsedService() {
    }

    public UsedService(Service service, int amount, float price) {
        this.service = service;
        this.amount = amount;
        this.price = price;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
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
}
