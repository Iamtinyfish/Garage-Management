package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Service;
import jakarta.ejb.Remote;

import java.util.ArrayList;

@Remote
public interface ServiceEJBRemote {
    public ArrayList<Service> getAll();

    public Service get(int serviceID);

    public ArrayList<Service> search(String keyword);

    public boolean add(Service service);

    public boolean update(Service service);

    public boolean delete(int serviceID);
}