package com.tfgarage.controller.dao;

import com.tfgarage.model.CustomerStat;

import java.util.ArrayList;
import java.util.Date;

public class CustomerStatDAO {
    public CustomerStatDAO(){
        super();
    }

    public ArrayList<CustomerStat> getAllStat(Date from, Date to) {
        //TODO getAllStat customer method
        ArrayList<CustomerStat> customerStatList = new ArrayList<CustomerStat>();
        return customerStatList;
    }

    public CustomerStat getStat(int CustomerID, Date from, Date to) {
        //TODO getStat 1 customer method
        return new CustomerStat();
    }
}
