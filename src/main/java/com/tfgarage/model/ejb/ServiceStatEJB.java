package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.ServiceStatEJBInterface;

import java.util.ArrayList;
import java.util.Date;

public class ServiceStatEJB implements ServiceStatEJBInterface {

    @Override
    public ArrayList<ServiceStat> getAllStat(Date from, Date to) {
        //TODO getAllStat service method
        return new ArrayList<ServiceStat>();
    }

    @Override
    public ServiceStat getStat(int ServiceID, Date from, Date to) {
        //TODO getStat 1 service method
        return new ServiceStat();
    }
}
