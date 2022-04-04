package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.local.AccessoryReceiptNoteEJBLocal;
import com.tfgarage.model.ejb.interfaces.remote.AccessoryReceiptNoteEJBRemote;
import com.tfgarage.model.entity.AccessoryReceiptNote;
import jakarta.ejb.Stateless;

import java.time.LocalDate;
import java.util.ArrayList;

@Stateless
public class AccessoryReceiptNoteEJB implements AccessoryReceiptNoteEJBLocal, AccessoryReceiptNoteEJBRemote {
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
    public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID, LocalDate from, LocalDate to) {
        //TODO getAll AccessoryReceiptNote method
        return null;
    }

    @Override
    public ArrayList<AccessoryReceiptNote> getListByAccessory(int accessoryID) {
        //TODO getAll AccessoryReceiptNote method
        return new ArrayList<AccessoryReceiptNote>();
    }
}
