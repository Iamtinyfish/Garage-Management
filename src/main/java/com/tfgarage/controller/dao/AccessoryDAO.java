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
    public ArrayList<Accessory> getAll(){
        ArrayList<Accessory> result = new ArrayList<Accessory>();
        return result;
    }
    public ArrayList<Accessory> getAcces(int id){
        ArrayList<Accessory> result = new ArrayList<Accessory>();
        return result;
    }
    public ArrayList<Accessory> searchAccess(String key){
        ArrayList<Accessory> result = new ArrayList<Accessory>();
        return result;
    }
}
