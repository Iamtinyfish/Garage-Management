package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;

import java.util.ArrayList;
import java.util.Date;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface ServiceStatEJBInterface{
    public ArrayList<ServiceStat> getAllStat(Date from, Date to);

    public ServiceStat getStat(int ServiceID, Date from, Date to);
}