package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.local.ProviderEJBLocal;
import com.tfgarage.model.ejb.interfaces.remote.ProviderEJBRemote;
import com.tfgarage.model.entity.Provider;
import jakarta.ejb.Stateless;

import java.util.ArrayList;

@Stateless
public class ProviderEJB implements ProviderEJBLocal, ProviderEJBRemote {

    @Override
    public ArrayList<Provider> getAll() {
        //TODO getAll provider method
        return new ArrayList<Provider>();
    }

    @Override
    public Provider get(int providerID) {
        //TODO get provider method
        return new Provider();
    }

    @Override
    public ArrayList<Provider> search(String keyword) {
        //TODO search provider method
        return new ArrayList<Provider>();
    }

    @Override
    public boolean add(Provider Provider) {
        //TODO add 1 provider method
        return true;
    }

    @Override
    public boolean update(Provider Provider) {
        //TODO update 1 provider method
        return true;
    }

    @Override
    public boolean delete(int ProviderID) {
        //TODO delete 1 provider method
        return true;
    }
}
