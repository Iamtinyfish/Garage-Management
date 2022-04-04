package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Employee;

import java.util.ArrayList;
import jakarta.ejb.Remote;

@Remote
public interface EmployeeEJBRemote {
    public ArrayList<Employee> getAll();

    public Employee get(int employeeID);

    public ArrayList<Employee> search(String keyword);

    public boolean add(Employee employee);

    public boolean update(Employee employee);

    public boolean delete(int employeeID);
}