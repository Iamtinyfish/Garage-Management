package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.AccessoryStatEJBInterface;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.Date;

@Stateless
public class AccessoryStatEJB implements AccessoryStatEJBInterface {

    @Override
    public ArrayList<AccessoryStat> getAllStat(Date from, Date to) {
        //TODO getAllStat accessory method
        return new ArrayList<AccessoryStat>();
    }

    @Override
    public AccessoryStat getStat(int accessoryID, Date from, Date to) {
        //TODO getStat 1 accessory method
        return new AccessoryStat();
    }
}
