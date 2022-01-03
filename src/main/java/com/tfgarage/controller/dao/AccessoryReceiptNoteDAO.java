package com.tfgarage.controller.dao;

import com.tfgarage.model.AccessoryReceiptNote;

import java.util.ArrayList;
import java.util.Date;

public class AccessoryReceiptNoteDAO {
    public ArrayList<AccessoryReceiptNote> getAll() {
        //TODO getAll accessoryReceiptNote method
        ArrayList<AccessoryReceiptNote> accessoryReceiptNoteList = new ArrayList<AccessoryReceiptNote>();
        return accessoryReceiptNoteList;
    }

    public AccessoryReceiptNote get(int accessoryReceiptNoteID) {
        //TODO get 1 accessoryReceiptNote method
        return new AccessoryReceiptNote();
    }

    public ArrayList<AccessoryReceiptNote> search(String keyword) {
        //TODO search accessoryReceiptNote method
        ArrayList<AccessoryReceiptNote> accessoryReceiptNoteList = new ArrayList<AccessoryReceiptNote>();
        return accessoryReceiptNoteList;
    }

    public boolean add(AccessoryReceiptNote accessoryReceiptNote) {
        //TODO add 1 accessoryReceiptNote method
        return true;
    }

    public boolean update(AccessoryReceiptNote accessoryReceiptNote) {
        //TODO update 1 accessoryReceiptNote method
        return true;
    }

    public boolean delete(int accessoryReceiptNoteID) {
        //TODO delete 1 accessoryReceiptNote method
        return true;
    }

    public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID, Date from, Date to) {
        //TODO getAll AccessoryReceiptNote method
        ArrayList<AccessoryReceiptNote> AccessoryReceiptNoteList = new ArrayList<AccessoryReceiptNote>();
        return AccessoryReceiptNoteList;
    }

    public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID) {
        //TODO getAll AccessoryReceiptNote method
        ArrayList<AccessoryReceiptNote> AccessoryReceiptNoteList = new ArrayList<AccessoryReceiptNote>();
        return AccessoryReceiptNoteList;
    }
}
