package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

import java.util.ArrayList;
import java.util.Date;

//@Remote
@Local
public interface AccessoryStatEJBInterface {

	public ArrayList<AccessoryStat> getAllStat(Date from, Date to);

	public AccessoryStat getStat(int accessoryID, Date from, Date to);
}