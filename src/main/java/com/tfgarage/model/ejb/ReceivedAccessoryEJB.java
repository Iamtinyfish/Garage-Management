package com.tfgarage.model.ejb;

import com.tfgarage.model.entity.ReceivedAccessory;

import java.util.ArrayList;

public class ReceivedAccessoryEJB implements ReceivedAccessoryEJBInterface {
    @Override
    public ArrayList<ReceivedAccessory> getAll() {
        //TODO getAll receivedAccessory method
        return new ArrayList<ReceivedAccessory>();
    }

    @Override
    public ReceivedAccessory get(int ReceivedAccessory_ID) {
        //TODO get 1 receivedAccessory method
        return new receivedAccessory();
    }

    @Override
    public ArrayList<ReceivedAccessory> search(String keyword) {
        //TODO search receivedAccessory method
        return new ArrayList<ReceivedAccessory>();
    }

    @Override
    public boolean add(ReceivedAccessory receivedAccessory) {
        //TODO add 1 receivedAccessory method
        return true;
    }

    @Override
    public boolean update(ReceivedAccessory receivedAccessory) {
        //TODO update 1 receivedAccessory method
        return true;
    }

    @Override
    public boolean delete(int accessoryID) {
        //TODO delete 1 receivedAccessory method
        return true;
    }
}
