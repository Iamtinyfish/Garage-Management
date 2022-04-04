package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.Employee;
import jakarta.ejb.Local;

import java.util.ArrayList;

@Local
public interface EmployeeEJBLocal {
    public ArrayList<Employee> getAll();

    public Employee get(int employeeID);

    public ArrayList<Employee> search(String keyword);

    public boolean add(Employee employee);

    public boolean update(Employee employee);

    public boolean delete(int employeeID);
}