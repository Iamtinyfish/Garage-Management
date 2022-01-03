/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;

import java.util.ArrayList;

import com.tfgarage.model.Customer;
/**
 *
 * @author Nello
 */
public class CustomerDAO extends DAO{
    public CustomerDAO(){
        super();
    }

    public ArrayList<Customer> getAll() {
        //TODO getAll customer method
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        return customerList;
    }

    public Customer get(int customerID) {
        //TODO get 1 customer method
        return new Customer();
    }

    public ArrayList<Customer> search(String keyword) {
        //TODO search customer method
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        return customerList;
    }

    public boolean add(Customer customer) {
        //TODO add 1 customer method
        return true;
    }

    public boolean update(Customer customer) {
        //TODO update 1 customer method
        return true;
    }

    public boolean delete(int customerID) {
        //TODO delete 1 customer method
        return true;
    }
}
