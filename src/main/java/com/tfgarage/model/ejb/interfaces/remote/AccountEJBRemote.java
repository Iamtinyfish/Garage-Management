package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Account;
import jakarta.ejb.Remote;

import java.util.ArrayList;

@Remote
public interface AccountEJBRemote {

    public ArrayList<Account> getAll();

    public Account get(String username);

    public ArrayList<Account> search(String keyword);

    public boolean add(Account account);

    public boolean update(Account account);

    public boolean delete(int accountID);
}
