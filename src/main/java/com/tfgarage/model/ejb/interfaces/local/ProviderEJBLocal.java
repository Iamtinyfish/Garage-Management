package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.Provider;
import jakarta.ejb.Local;

import java.util.ArrayList;

@Local
public interface ProviderEJBLocal {
    public ArrayList<Provider> getAll();

    public Provider get(int providerID);

    public ArrayList<Provider> search(String keyword);

    public boolean add(Provider Provider);

    public boolean update(Provider Provider);

    public boolean delete(int ProviderID);
}