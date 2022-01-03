/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;

import com.tfgarage.model.Bill;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nello
 */
public class BillDAO {
    public ArrayList<Bill> getAll() {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public Bill get(int bill_ID) {
        //TODO get 1 bill method
        return new Bill();
    }

    public ArrayList<Bill> search(String keyword) {
        //TODO search bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public boolean add(Bill bill) {
        //TODO add 1 bill method
        return true;
    }

    public boolean update(Bill bill) {
        //TODO update 1 bill method
        return true;
    }

    public boolean delete(int bill_ID) {
        //TODO delete 1 bill method
        return true;
    }

    public ArrayList<Bill> getListByService(int serviceID) {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public ArrayList<Bill> getListByAccessory(int accessoryID, Date from, Date to) {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public ArrayList<Bill> getListByCustomer(int customerID, Date from, Date to) {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public ArrayList<Bill> getListByService(int serviceID, Date from, Date to) {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public ArrayList<Bill> getListByAccessory(int accessoryID) {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }

    public ArrayList<Bill> getListByCustomer(int customerID) {
        //TODO getAll bill method
        ArrayList<Bill> billList = new ArrayList<Bill>();
        return billList;
    }
}
