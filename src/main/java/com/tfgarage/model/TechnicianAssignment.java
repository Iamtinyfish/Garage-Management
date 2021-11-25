package com.tfgarage.model;

public class TechnicianAssignment {

	private Employee technician;

	public TechnicianAssignment() {
	}

	public TechnicianAssignment(Employee technician) {
		this.technician = technician;
	}

	public Employee getTechnician() {
		return technician;
	}

	public void setTechnician(Employee technician) {
		this.technician = technician;
	}
}