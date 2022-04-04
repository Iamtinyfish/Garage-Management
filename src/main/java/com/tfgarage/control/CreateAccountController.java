package com.tfgarage.control;

import com.tfgarage.model.ejb.interfaces.local.AccountEJBLocal;

import com.tfgarage.model.entity.Account;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class CreateAccountController{
    @EJB
    private AccountEJBLocal accountEJB;

    private Account newAccount;

    public Account getNewAccount() {
        return newAccount;
    }

    public void setNewAccount(Account newAccount) {
        this.newAccount = newAccount;
    }

    public void createAccount() {
        Account account = new Account();
        account.setUsername("admin");
        account.setPassword("123456");
        account.setRole("admin");
        accountEJB.add(account);
    }
}
