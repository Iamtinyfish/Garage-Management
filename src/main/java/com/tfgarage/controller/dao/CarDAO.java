package com.tfgarage.controller.dao;

import com.tfgarage.model.Car;

import java.util.ArrayList;

public class CarDAO {
   public ArrayList<Car> getAll() {
       //TODO getAll car method
       ArrayList<Car> carList = new ArrayList<Car>();
       return carList;
   }

    public Car get(int carID) {
        //TODO get 1 car method
        return new Car();
    }

   public ArrayList<Car> search(String keyword) {
       //TODO search car method
       ArrayList<Car> carList = new ArrayList<Car>();
       return carList;
   }

    public boolean add(Car car) {
        //TODO add 1 car method
        return true;
    }

    public boolean update(Car car) {
        //TODO update 1 car method
        return true;
    }

    public boolean delete(int carID) {
        //TODO delete 1 car method
        return true;
    }
}
