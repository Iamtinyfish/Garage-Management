package com.tfgarage.model;

import java.util.Date;
import java.util.List;

public class Bill {

	private int id;
	private List<UsedService> usedServices;
	private List<UsedAccessory> usedAccessories;
	private float totalPrice;
	private String status;
	private Date startDay;
	private Date lastestEditDay;
	private Date paymentDay;
	private Employee employee;
	private Customer customer;
	private List<TechnicianAssignment> technicianAssignment;
	private String note;

	public Bill() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<UsedService> getUsedServices() {
		return usedServices;
	}

	public void setUsedServices(List<UsedService> usedServices) {
		this.usedServices = usedServices;
	}

	public List<UsedAccessory> getUsedAccessories() {
		return usedAccessories;
	}

	public void setUsedAccessories(List<UsedAccessory> usedAccessories) {
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

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
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

	public List<TechnicianAssignment> getTechnicianAssignment() {
		return technicianAssignment;
	}

	public void setTechnicianAssignment(List<TechnicianAssignment> technicianAssignment) {
		this.technicianAssignment = technicianAssignment;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}