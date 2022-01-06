package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.CustomerStatEJBInterface;

import java.util.ArrayList;
import java.util.Date;

public class CustomerStatEJB implements CustomerStatEJBInterface {

    @Override
    public ArrayList<CustomerStat> getAllStat(Date from, Date to) {
        //TODO getAllStat customer method
        return new ArrayList<CustomerStat>();
    }

    @Override
    public CustomerStat getStat(int CustomerID, Date from, Date to) {
        //TODO getStat 1 customer method
        return new CustomerStat();
    }
}
