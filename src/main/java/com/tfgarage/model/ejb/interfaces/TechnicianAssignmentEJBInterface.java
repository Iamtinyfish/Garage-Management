package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface TechnicianAssignmentEJBInterface {
    public TechnicianAssignment get(int technicianAssignmentID);

    public boolean add(TechnicianAssignment technicianAssignment);

    public boolean update(TechnicianAssignment technicianAssignment);

    public boolean delete(int technicianAssignmentID);
}