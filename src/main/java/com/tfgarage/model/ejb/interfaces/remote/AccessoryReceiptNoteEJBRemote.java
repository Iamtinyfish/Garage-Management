package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.AccessoryReceiptNote;
import jakarta.ejb.Remote;

import java.time.LocalDate;
import java.util.ArrayList;


@Remote
public interface AccessoryReceiptNoteEJBRemote {

	public ArrayList<AccessoryReceiptNote> getAll();

	public AccessoryReceiptNote get(int accessoryReceiptNoteID);

	public ArrayList<AccessoryReceiptNote> search(String keyword);

	public boolean add(AccessoryReceiptNote accessoryReceiptNote);

	public boolean update(AccessoryReceiptNote accessoryReceiptNote);

	public boolean delete(int accessoryReceiptNoteID);

	public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID, LocalDate from, LocalDate to);

	public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID);
}