package com.tfgarage.model.ejb.interfaces.remote;

import com.tfgarage.model.entity.Provider;
import jakarta.ejb.Remote;

import java.util.ArrayList;

@Remote
public interface ProviderEJBRemote {
    public ArrayList<Provider> getAll();

    public Provider get(int providerID);

    public ArrayList<Provider> search(String keyword);

    public boolean add(Provider Provider);

    public boolean update(Provider Provider);

    public boolean delete(int ProviderID);
}