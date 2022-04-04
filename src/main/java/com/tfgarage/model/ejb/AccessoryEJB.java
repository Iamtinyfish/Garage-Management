package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.local.AccessoryEJBLocal;
import com.tfgarage.model.ejb.interfaces.remote.AccessoryEJBRemote;
import jakarta.ejb.Stateless;
import com.tfgarage.model.entity.Accessory;
import java.util.ArrayList;

@Stateless
public class AccessoryEJB implements AccessoryEJBLocal, AccessoryEJBRemote {

    @Override
    public ArrayList<Accessory> getAll() {
        //TODO getAll accessory method
        ArrayList<Accessory> accessoryList = new ArrayList<Accessory>();
        return accessoryList;
    }

    @Override
    public Accessory get(int accessoryID) {
        //TODO get 1 accessory method
        return new Accessory();
    }

    @Override
    public ArrayList<Accessory> search(String keyword) {
        //TODO search accessory method
        ArrayList<Accessory> accessoryList = new ArrayList<Accessory>();
        return accessoryList;
    }

    @Override
    public boolean add(Accessory accessory) {
        //TODO add 1 accessory method
        return true;
    }

    @Override
    public boolean update(Accessory accessory) {
        //TODO update 1 accessory method
        return true;
    }

    @Override
    public boolean delete(int accessoryID) {
        //TODO delete 1 accessory method
        return true;
    }
}
