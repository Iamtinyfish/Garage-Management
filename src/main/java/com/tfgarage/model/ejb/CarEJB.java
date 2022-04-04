package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.remote.CarEJBRemote;
import com.tfgarage.model.entity.Car;
import com.tfgarage.model.ejb.interfaces.local.CarEJBLocal;
import jakarta.ejb.Stateless;

import java.util.ArrayList;

@Stateless
public class CarEJB implements CarEJBLocal, CarEJBRemote {
    
    @Override
    public ArrayList<Car> getAll() {
        //TODO getAll car method
        return new ArrayList<Car>();
    }

    @Override
    public Car get(int carID) {
        //TODO get 1 car method
        return new Car();
    }

    @Override
    public ArrayList<Car> search(String keyword) {
        //TODO search car method
        return new ArrayList<Car>();
    }

    @Override
    public boolean add(Car car) {
        //TODO add 1 car method
        return true;
    }

    @Override
    public boolean update(Car car) {
        //TODO update 1 car method
        return true;
    }

    @Override
    public boolean delete(int carID) {
        //TODO delete 1 car method
        return true;
    }
}
