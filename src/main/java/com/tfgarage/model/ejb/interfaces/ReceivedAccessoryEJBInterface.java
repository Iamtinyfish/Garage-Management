package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface ReceivedAccessoryEJBInterface {
    public ArrayList<ReceivedAccessory> getAll();

    public ReceivedAccessory get(int ReceivedAccessory_ID);

    public ArrayList<ReceivedAccessory> search(String keyword);

    public boolean add(ReceivedAccessory receivedAccessory);

    public boolean update(ReceivedAccessory receivedAccessory);

    public boolean delete(int accessoryID);
}