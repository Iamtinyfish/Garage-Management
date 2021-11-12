package com.tfgarage.model;

public class ReceivedAccessory {
    private Accessory accessory;
    private int amount;
    private int receivedPrice;

    public ReceivedAccessory() {
    }

    public ReceivedAccessory(Accessory accessory, int amount, int receivedPrice) {
        this.accessory = accessory;
        this.amount = amount;
        this.receivedPrice = receivedPrice;
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

    public int getReceivedPrice() {
        return receivedPrice;
    }

    public void setReceivedPrice(int receivedPrice) {
        this.receivedPrice = receivedPrice;
    }
}
