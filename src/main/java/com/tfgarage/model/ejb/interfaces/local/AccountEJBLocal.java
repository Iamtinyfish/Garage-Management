package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.Account;
import jakarta.ejb.Local;

import java.util.ArrayList;

@Local
public interface AccountEJBLocal {

    public ArrayList<Account> getAll();

    public Account get(String username);

    public ArrayList<Account> search(String keyword);

    public boolean add(Account account);

    public boolean update(Account account);

    public boolean delete(int accountID);
}
