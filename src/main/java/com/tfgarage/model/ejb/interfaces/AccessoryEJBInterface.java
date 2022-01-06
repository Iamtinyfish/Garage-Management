package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;
import com.tfgarage.model.entity.Accessory;
//import jakarta.ejb.Remote;

import java.util.ArrayList;

//@Remote
@Local
public interface AccessoryEJBInterface {

	public ArrayList<Accessory> getAll();

	public Accessory get(int accessoryID);

	public ArrayList<Accessory> search(String keyword);

	public boolean add(Accessory accessory);

	public boolean update(Accessory accessory);

	public boolean delete(int accessoryID);
}