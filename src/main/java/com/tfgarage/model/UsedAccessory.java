package com.tfgarage.model;

public class UsedAccessory {
    private Accessory accessory;
    private int amount;
    private float price;

    public UsedAccessory() {
    }

    public UsedAccessory(Accessory accessory, int amount, float price) {
        this.accessory = accessory;
        this.amount = amount;
        this.price = price;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
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

