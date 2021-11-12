package com.tfgarage.model;

public class Accessory {
    private int id;
    private String name;
    private float receivedPrice;
    private float price;
    private String description;
    private int stock;

    public Accessory() {
    }

    public Accessory(int id, String name, float receivedPrice,
                     float price, String description, int stock) {
        this.id = id;
        this.name = name;
        this.receivedPrice = receivedPrice;
        this.price = price;
        this.description = description;
        this.stock = stock;
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

    public float getReceivedPrice() {
        return receivedPrice;
    }

    public void setReceivedPrice(float receivedPrice) {
        this.receivedPrice = receivedPrice;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}