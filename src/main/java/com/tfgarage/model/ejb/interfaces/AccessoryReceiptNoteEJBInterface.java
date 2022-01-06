package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.AccessoryReceiptNote;
import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

import java.util.ArrayList;
import java.util.Date;

//@Remote
@Local
public interface AccessoryReceiptNoteEJBInterface {

	public ArrayList<AccessoryReceiptNote> getAll();

	public AccessoryReceiptNote get(int accessoryReceiptNoteID);

	public ArrayList<AccessoryReceiptNote> search(String keyword);

	public boolean add(AccessoryReceiptNote accessoryReceiptNote);

	public boolean update(AccessoryReceiptNote accessoryReceiptNote);

	public boolean delete(int accessoryReceiptNoteID);

	public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID, Date from, Date to);

	public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID);
}