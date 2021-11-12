package com.tfgarage.model;

import java.util.Date;

public class Bill {
    private int id;
    private UsedService[] usedServices;
    private UsedAccessory[] usedAccessories;
    private float totalPrice;
    private String status;
    private Date lastestEditDay;
    private Date paymentDay;
    private Employee employee;
    private Customer customer;
    private Technician technician;

    public Bill() {
    }

    public Bill(int id, UsedService[] usedServices, UsedAccessory[] usedAccessories, float totalPrice, String status,
                Date lastestEditDay, Date paymentDay, Employee employee, Customer customer, Technician technician) {
        this.id = id;
        this.usedServices = usedServices;
        this.usedAccessories = usedAccessories;
        this.totalPrice = totalPrice;
        this.status = status;
        this.lastestEditDay = lastestEditDay;
        this.paymentDay = paymentDay;
        this.employee = employee;
        this.customer = customer;
        this.technician = technician;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsedService[] getUsedServices() {
        return usedServices;
    }

    public void setUsedServices(UsedService[] usedServices) {
        this.usedServices = usedServices;
    }

    public UsedAccessory[] getUsedAccessories() {
        return usedAccessories;
    }

    public void setUsedAccessories(UsedAccessory[] usedAccessories) {
        this.usedAccessories = usedAccessories;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastestEditDay() {
        return lastestEditDay;
    }

    public void setLastestEditDay(Date lastestEditDay) {
        this.lastestEditDay = lastestEditDay;
    }

    public Date getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Date paymentDay) {
        this.paymentDay = paymentDay;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
}
