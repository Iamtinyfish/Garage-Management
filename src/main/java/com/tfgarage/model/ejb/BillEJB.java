package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.local.BillEJBLocal;
import com.tfgarage.model.ejb.interfaces.remote.BillEJBRemote;
import com.tfgarage.model.entity.Bill;
import jakarta.ejb.Stateless;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Stateless
public class BillEJB implements BillEJBLocal, BillEJBRemote {
    @Override
    public ArrayList<Bill> getAll() {
        //TODO getAll bill method
        return new ArrayList<Bill>();
    }

    @Override
    public Bill get(int bill_ID) {
        //TODO get 1 bill method
        return new Bill();
    }

    @Override
    public ArrayList<Bill> search(String keyword) {
        //TODO search bill method
        return new ArrayList<Bill>();
    }

    @Override
    public boolean add(Bill bill) {
        //TODO add 1 bill method
        return true;
    }

    @Override
    public boolean update(Bill bill) {
        //TODO update 1 bill method
        return true;
    }

    @Override
    public boolean delete(int bill_ID) {
        //TODO delete 1 bill method
        return true;
    }

    @Override
    public ArrayList<Bill> getListByService(int serviceID) {
        //TODO getAll bill method
        return new ArrayList<Bill>();
    }

    @Override
    public ArrayList<Bill> getListByAccessory(int accessoryID, LocalDate from, LocalDate to) {
        //TODO get list by accessory method
        return null;
    }

    @Override
    public ArrayList<Bill> getListByCustomer(int customerID, LocalDate from, LocalDate to) {
        //TODO get list by customer method
        return null;
    }

    @Override
    public ArrayList<Bill> getListByService(int serviceID, LocalDate from, LocalDate to) {
        //TODO get list by service method
        return null;
    }


    @Override
    public ArrayList<Bill> getListByAccessory(int accessoryID) {
        //TODO getAll bill method
        return new ArrayList<Bill>();
    }

    @Override
    public ArrayList<Bill> getListByCustomer(int customerID) {
        //TODO getAll bill method
        return new ArrayList<Bill>();
    }
}
