package com.tfgarage.control;

import com.tfgarage.model.ejb.interfaces.local.AccountEJBLocal;
import com.tfgarage.model.entity.Account;
import com.tfgarage.utils.SessionUtils;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class AccountController {
    @EJB
    private AccountEJBLocal accountEJB;

    public String getUsername() {
        return SessionUtils.getUsername();
    }
}
