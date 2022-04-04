package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.AccessoryReceiptNote;
import jakarta.ejb.Local;

import java.time.LocalDate;
import java.util.ArrayList;

@Local
public interface AccessoryReceiptNoteEJBLocal {

	public ArrayList<AccessoryReceiptNote> getAll();

	public AccessoryReceiptNote get(int accessoryReceiptNoteID);

	public ArrayList<AccessoryReceiptNote> search(String keyword);

	public boolean add(AccessoryReceiptNote accessoryReceiptNote);

	public boolean update(AccessoryReceiptNote accessoryReceiptNote);

	public boolean delete(int accessoryReceiptNoteID);

	public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID, LocalDate from, LocalDate to);

	public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID);
}