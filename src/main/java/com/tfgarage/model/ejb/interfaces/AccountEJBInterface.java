package com.tfgarage.model.ejb.interfaces;

import com.tfgarage.model.entity.Account;
import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

import java.util.ArrayList;

//@Remote
@Local
public interface AccountEJBInterface {

    public boolean checkLogin(String username, String password);

    public ArrayList<Account> getAll();

    public Account get(int accountID);

    public ArrayList<Account> search(String keyword);

    public boolean add(Account account);

    public boolean update(Account account);

    public boolean delete(int accountID);
}
