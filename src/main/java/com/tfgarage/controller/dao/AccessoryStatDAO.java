package com.tfgarage.controller.dao;

import com.tfgarage.model.AccessoryStat;

import java.util.ArrayList;
import java.util.Date;

public class AccessoryStatDAO {
    public AccessoryStatDAO(){
        super();
    }

    public ArrayList<AccessoryStat> getAllStat(Date from, Date to) {
        //TODO getAllStat accessory method
        ArrayList<AccessoryStat> accessoryStatList = new ArrayList<AccessoryStat>();
        return accessoryStatList;
    }

    public AccessoryStat getStat(int accessoryID, Date from, Date to) {
        //TODO getStat 1 accessory method
        return new AccessoryStat();
    }
}
