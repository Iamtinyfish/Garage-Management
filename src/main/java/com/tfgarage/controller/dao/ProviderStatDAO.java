package com.tfgarage.controller.dao;

import com.tfgarage.model.ProviderStat;

import java.util.ArrayList;
import java.util.Date;

public class ProviderStatDAO {
    public ProviderStatDAO(){
        super();
    }

    public ArrayList<ProviderStat> getAllStat(Date from, Date to) {
        //TODO getAllStat provider method
        ArrayList<ProviderStat> providerStatList = new ArrayList<ProviderStat>();
        return providerStatList;
    }

    public ProviderStat getStat(int ProviderID, Date from, Date to) {
        //TODO getStat 1 provider method
        return new ProviderStat();
    }
}
