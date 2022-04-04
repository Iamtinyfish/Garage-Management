package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Customer;
import java.util.ArrayList;
import jakarta.ejb.Remote;

@Remote
public interface CustomerEJBRemote {
    public ArrayList<Customer> getAll();

    public Customer get(int customerID);

    public ArrayList<Customer> search(String keyword);

    public boolean add(Customer customer);
    
    public boolean update(Customer customer);

    public boolean delete(int customerID);
}