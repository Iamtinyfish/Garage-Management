package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.AccessoryReceiptNoteEJBInterface;
import com.tfgarage.model.entity.AccessoryReceiptNote;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.Date;

@Stateless
public class AccessoryReceiptNoteEJB implements AccessoryReceiptNoteEJBInterface {
    @Override
    public ArrayList<AccessoryReceiptNote> getAll() {
        //TODO getAll accessoryReceiptNote method
        return new ArrayList<AccessoryReceiptNote>();
    }

    @Override
    public AccessoryReceiptNote get(int accessoryReceiptNoteID) {
        //TODO get 1 accessoryReceiptNote method
        return new AccessoryReceiptNote();
    }

    @Override
    public ArrayList<AccessoryReceiptNote> search(String keyword) {
        //TODO search accessoryReceiptNote method
        return new ArrayList<AccessoryReceiptNote>();
    }

    @Override
    public boolean add(AccessoryReceiptNote accessoryReceiptNote) {
        //TODO add 1 accessoryReceiptNote method
        return true;
    }

    @Override
    public boolean update(AccessoryReceiptNote accessoryReceiptNote) {
        //TODO update 1 accessoryReceiptNote method
        return true;
    }

    @Override
    public boolean delete(int accessoryReceiptNoteID) {
        //TODO delete 1 accessoryReceiptNote method
        return true;
    }

    @Override
    public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID, Date from, Date to) {
        //TODO getAll AccessoryReceiptNote method
        return new ArrayList<AccessoryReceiptNote>();
    }

    @Override
    public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID) {
        //TODO getAll AccessoryReceiptNote method
        return new ArrayList<AccessoryReceiptNote>();
    }
}
