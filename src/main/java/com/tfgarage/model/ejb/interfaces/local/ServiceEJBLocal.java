package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.Service;
import jakarta.ejb.Local;

import java.util.ArrayList;

@Local
public interface ServiceEJBLocal {
    public ArrayList<Service> getAll();

    public Service get(int serviceID);

    public ArrayList<Service> search(String keyword);

    public boolean add(Service service);

    public boolean update(Service service);

    public boolean delete(int serviceID);
}