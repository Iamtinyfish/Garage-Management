package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;

import java.util.ArrayList;
import java.util.Date;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface CustomerStatEJBInterface {
    
    public ArrayList<CustomerStat> getAllStat(Date from, Date to);

    public CustomerStat getStat(int CustomerID, Date from, Date to);
}