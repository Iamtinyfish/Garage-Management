package com.tfgarage.controller.dao;

import com.tfgarage.model.ServiceStat;

import java.util.ArrayList;
import java.util.Date;

public class ServiceStatDAO {
    public ServiceStatDAO(){
        super();
    }

    public ArrayList<ServiceStat> getAllStat(Date from, Date to) {
        //TODO getAllStat service method
        ArrayList<ServiceStat> serviceStatList = new ArrayList<ServiceStat>();
        return serviceStatList;
    }

    public ServiceStat getStat(int ServiceID, Date from, Date to) {
        //TODO getStat 1 service method
        return new ServiceStat();
    }
}
