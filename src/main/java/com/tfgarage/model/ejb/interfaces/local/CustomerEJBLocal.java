package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.Customer;
import jakarta.ejb.Local;

import java.util.ArrayList;

@Local
public interface CustomerEJBLocal {
    public ArrayList<Customer> getAll();

    public Customer get(int customerID);

    public ArrayList<Customer> search(String keyword);


    public boolean add(Customer customer);
    
    public boolean update(Customer customer);

    public boolean delete(int customerID);
}