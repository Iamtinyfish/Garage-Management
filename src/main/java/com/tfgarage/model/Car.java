package com.tfgarage.model;

public class Car {
    private String licensePlate;
    private Customer owner;

    public Car() {
    }

    public Car(String licensePlate, Customer owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
