package com.tfgarage.model.ejb;

import java.util.ArrayList;
import java.util.Date;

public class ProviderStatEJB implements ProviderStatEJBInterface {
    
    @Override
    public ArrayList<ProviderStat> getAllStat(Date from, Date to) {
        //TODO getAllStat provider method
        return new ArrayList<ProviderStat>();
    }

    @Override
    public ProviderStat getStat(int ProviderID, Date from, Date to) {
        //TODO getStat 1 provider method
        return new ProviderStat();
    }
}
