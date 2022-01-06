package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.Car;
import jakarta.ejb.Local;

import java.util.ArrayList;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface CarEJBInterface {
    public ArrayList<Car> getAll();

    public Car get(int carID);
        

    public ArrayList<Car> search(String keyword);

    public boolean add(Car car);
        

    public boolean update(Car car);
        

    public boolean delete(int carID);
}