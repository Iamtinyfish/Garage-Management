package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.Bill;
import jakarta.ejb.Local;

import java.util.ArrayList;
import java.util.Date;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface BillEJBInterface {
    public ArrayList<Bill> getAll();

    public Bill get(int bill_ID);

    public ArrayList<Bill> search(String keyword);

    public boolean add(Bill bill);

    public boolean update(Bill bill);

    public boolean delete(int bill_ID);

    public ArrayList<Bill> getListByService(int serviceID);

    public ArrayList<Bill> getListByAccessory(int accessoryID, Date from, Date to);

    public ArrayList<Bill> getListByCustomer(int customerID, Date from, Date to);

    public ArrayList<Bill> getListByService(int serviceID, Date from, Date to);

    public ArrayList<Bill> getListByAccessory(int accessoryID);

    public ArrayList<Bill> getListByCustomer(int customerID);
}