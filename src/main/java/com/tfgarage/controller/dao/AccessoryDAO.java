/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;

import com.tfgarage.model.Accessory;
import java.util.ArrayList;

/**
 *
 * @author Nello
 */
public class AccessoryDAO extends DAO {
    public AccessoryDAO(){
        super();
    }

    public ArrayList<Accessory> getAll() {
        //TODO getAll accessory method
        ArrayList<Accessory> accessoryList = new ArrayList<Accessory>();
        return accessoryList;
    }

    public Accessory get(int accessoryID) {
        //TODO get 1 accessory method
        return new Accessory();
    }

    public ArrayList<Accessory> search(String keyword) {
        //TODO search accessory method
        ArrayList<Accessory> accessoryList = new ArrayList<Accessory>();
        return accessoryList;
    }

    public boolean add(Accessory accessory) {
        //TODO add 1 accessory method
        return true;
    }

    public boolean update(Accessory accessory) {
        //TODO update 1 accessory method
        return true;
    }

    public boolean delete(int accessoryID) {
        //TODO delete 1 accessory method
        return true;
    }
}
