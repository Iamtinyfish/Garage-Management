package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.UsedAccessory;
import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface UsedAccessoryEJBInterface {
    public boolean add(UsedAccessory usedAccessory);

    public boolean update(UsedAccessory usedAccessory);

    public boolean delete(int usedAccessoryID);
}