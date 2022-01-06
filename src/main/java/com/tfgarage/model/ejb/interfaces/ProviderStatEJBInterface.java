package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface ProviderStatEJBInterface {
    public ArrayList<ProviderStat> getAllStat(Date from, Date to);

    public ProviderStat getStat(int ProviderID, Date from, Date to);
}