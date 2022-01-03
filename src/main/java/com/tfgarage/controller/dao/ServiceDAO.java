/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;
import java.util.ArrayList;
import com.tfgarage.model.Service;
/**
 *
 * @author Nello
 */
public class ServiceDAO extends DAO{
    public ServiceDAO(){
        super();
    }

    public ArrayList<Service> getAll() {
        //TODO getAll service method
        ArrayList<Service> serviceList = new ArrayList<Service>();
        return serviceList;
    }

    public Service get(int serviceID) {
        //TODO get 1 service method
        return new Service();
    }

    public ArrayList<Service> search(String keyword) {
        //TODO search service method
        ArrayList<Service> serviceList = new ArrayList<Service>();
        return serviceList;
    }

    public boolean add(Service service) {
        //TODO add 1 service method
        return true;
    }

    public boolean update(Service service) {
        //TODO update 1 service method
        return true;
    }

    public boolean delete(int serviceID) {
        //TODO delete 1 service method
        return true;
    }
}
