package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.local.AccountEJBLocal;
import com.tfgarage.model.ejb.interfaces.remote.AccountEJBRemote;
import com.tfgarage.model.entity.Account;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;

import java.util.ArrayList;

@Stateless(mappedName = "com/tfgarage/model/ejb/AccountEJB.java")
public class AccountEJB implements AccountEJBLocal, AccountEJBRemote {
    @PersistenceContext
    private EntityManager em;

    @Override
    public ArrayList<Account> getAll() {
        //TODO getAll account method
        return new ArrayList<Account>();
    }

    @Override
    public Account get(String username) {
        return em.unwrap(Session.class)
                .bySimpleNaturalId(Account.class)
                .load(username);
    }

    @Override
    public ArrayList<Account> search(String keyword) {
        //TODO search account method
        return new ArrayList<Account>();
    }

    @Override
    @Transactional
    public boolean add(Account account) {
        em.persist(account);
        em.flush();
        return true;
    }

    @Override
    public boolean update(Account account) {
        //TODO update 1 account method
        return true;
    }

    @Override
    public boolean delete(int accountID) {
        //TODO delete 1 account method
        return true;
    }
}
