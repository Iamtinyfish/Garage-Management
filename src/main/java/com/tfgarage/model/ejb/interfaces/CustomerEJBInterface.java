package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.Customer;
import jakarta.ejb.Local;

import java.util.ArrayList;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface CustomerEJBInterface {
    public ArrayList<Customer> getAll();

    public Customer get(int customerID);

    public ArrayList<Customer> search(String keyword);


    public boolean add(Customer customer);
    
    public boolean update(Customer customer);

    public boolean delete(int customerID);
}