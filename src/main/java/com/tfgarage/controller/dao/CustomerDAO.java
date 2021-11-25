/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    public ArrayList<Customer> getAllCustomer(){
        ArrayList<Customer> result = new ArrayList<Customer>();
        return result;
    }
    public ArrayList<Customer> getCustomer(int id){
        ArrayList<Customer> result = new ArrayList<Customer>();
        return result;
    }
    public boolean addCustomer(Customer customer){
        boolean result= true;
        return result;
    }
    public boolean deleteCustomer(Customer customer){
        boolean result= true;
        return result;
    }
    public boolean editCustomer(Customer customer){
        boolean result= true;
        return result;
    }
    public ArrayList<Customer> searchCustomer(String key){
        ArrayList<Customer> result = new ArrayList<Customer>();
        return result;
    }
}
