package com.tfgarage.model.ejb;

import com.tfgarage.model.entity.Service;
import com.tfgarage.model.ejb.interfaces.ServiceEJBInterface;

import java.util.ArrayList;

public class ServiceEJB implements ServiceEJBInterface {

    @Override
    public ArrayList<Service> getAll() {
        //TODO getAll service method
        return new ArrayList<Service>();
    }

    @Override
    public Service get(int serviceID) {
        //TODO get 1 service method
        return new Service();
    }

    @Override
    public ArrayList<Service> search(String keyword) {
        //TODO search service method
        return new ArrayList<Service>();
    }

    @Override
    public boolean add(Service service) {
        //TODO add 1 service method
        return true;
    }

    @Override
    public boolean update(Service service) {
        //TODO update 1 service method
        return true;
    }

    @Override
    public boolean delete(int serviceID) {
        //TODO delete 1 service method
        return true;
    }
}
