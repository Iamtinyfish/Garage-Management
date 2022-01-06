package com.tfgarage.model.ejb;

import com.tfgarage.model.entity.Employee;
import com.tfgarage.model.ejb.interfaces.EmployeeEJBInterface;

import java.util.ArrayList;

public class EmployeeEJB implements EmployeeEJBInterface {

    @Override
    public ArrayList<Employee> getAll() {
        //TODO getAll employee method
        return new ArrayList<Employee>();
    }

    @Override
    public Employee get(int employeeID) {
        //TODO get employee method
        return null;
    }

    @Override
    public ArrayList<Employee> search(String keyword) {
        //TODO search employee method
        return new ArrayList<Employee>();
    }

    @Override
    public boolean add(Employee employee) {
        //TODO add 1 employee method
        return true;
    }

    @Override
    public boolean update(Employee employee) {
        //TODO update 1 employee method
        return true;
    }

    @Override
    public boolean delete(int employeeID) {
        //TODO delete 1 employee method
        return true;
    }
}
