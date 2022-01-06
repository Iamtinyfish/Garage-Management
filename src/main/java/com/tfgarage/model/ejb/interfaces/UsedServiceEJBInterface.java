package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.UsedService;
import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface UsedServiceEJBInterface {
    public boolean add(UsedService usedService);

    public boolean update(UsedService usedService);

    public boolean delete(int usedServiceID);
}