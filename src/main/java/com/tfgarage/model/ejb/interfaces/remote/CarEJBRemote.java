package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Car;

import java.util.ArrayList;
import jakarta.ejb.Remote;

@Remote
public interface CarEJBRemote {
    public ArrayList<Car> getAll();

    public Car get(int carID);
        

    public ArrayList<Car> search(String keyword);

    public boolean add(Car car);
        

    public boolean update(Car car);
        

    public boolean delete(int carID);
}