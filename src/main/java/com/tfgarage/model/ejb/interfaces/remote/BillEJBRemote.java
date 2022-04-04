package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Bill;

import java.time.LocalDate;
import java.util.ArrayList;
import jakarta.ejb.Remote;

@Remote
public interface BillEJBRemote {
    public ArrayList<Bill> getAll();

    public Bill get(int bill_ID);

    public ArrayList<Bill> search(String keyword);

    public boolean add(Bill bill);

    public boolean update(Bill bill);

    public boolean delete(int bill_ID);

    public ArrayList<Bill> getListByService(int serviceID);

    public ArrayList<Bill> getListByAccessory(int accessoryID, LocalDate from, LocalDate to);

    public ArrayList<Bill> getListByCustomer(int customerID, LocalDate from, LocalDate to);

    public ArrayList<Bill> getListByService(int serviceID, LocalDate from, LocalDate to);

    public ArrayList<Bill> getListByAccessory(int accessoryID);

    public ArrayList<Bill> getListByCustomer(int customerID);
}