/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.model.ejb;

import com.tfgarage.model.entity.Customer;
import com.tfgarage.model.ejb.interfaces.CustomerEJBInterface;
import jakarta.ejb.Stateless;

import java.util.ArrayList;

@Stateless
public class CustomerEJB implements CustomerEJBInterface {
    @Override
    public ArrayList<Customer> getAll() {
        //TODO getAll customer method
        return new ArrayList<Customer>();
    }

    @Override
    public Customer get(int customerID) {
        //TODO get 1 customer method
        return new Customer();
    }

    @Override
    public ArrayList<Customer> search(String keyword) {
        //TODO search customer method
        return new ArrayList<Customer>();
    }

    @Override
    public boolean add(Customer customer) {
        //TODO add 1 customer method
        return true;
    }

    @Override
    public boolean update(Customer customer) {
        //TODO update 1 customer method
        return true;
    }

    @Override
    public boolean delete(int customerID) {
        //TODO delete 1 customer method
        return true;
    }
}
