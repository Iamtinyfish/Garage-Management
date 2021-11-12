package com.tfgarage.model;

import java.util.Date;

public class AccessoriesReceiptNote {
    private int id;
    private ReceivedAccessory[] receivedAccessories;
    private float totalCost;
    private Date receiptDay;
    private Employee employee;
    private Provider provider;

    public AccessoriesReceiptNote() {
    }

    public AccessoriesReceiptNote(int id, ReceivedAccessory[] receivedAccessories, float totalCost,
                                  Date receiptDay, Employee employee, Provider provider) {
        this.id = id;
        this.receivedAccessories = receivedAccessories;
        this.totalCost = totalCost;
        this.receiptDay = receiptDay;
        this.employee = employee;
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReceivedAccessory[] getReceivedAccessories() {
        return receivedAccessories;
    }

    public void setReceivedAccessories(ReceivedAccessory[] receivedAccessories) {
        this.receivedAccessories = receivedAccessories;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public Date getReceiptDay() {
        return receiptDay;
    }

    public void setReceiptDay(Date receiptDay) {
        this.receiptDay = receiptDay;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
