package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.Service;
import jakarta.ejb.Local;

import java.util.ArrayList;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface ServiceEJBInterface {
    public ArrayList<Service> getAll();

    public Service get(int serviceID);

    public ArrayList<Service> search(String keyword);

    public boolean add(Service service);

    public boolean update(Service service);

    public boolean delete(int serviceID);
}