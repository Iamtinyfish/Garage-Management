package com.tfgarage.model.ejb.interfaces;

import jakarta.ejb.Local;
//import jakarta.ejb.Remote;

//@Remote
@Local
public interface ProviderEJBInterface {
    public ArrayList<Provider> getAll();

    public Provider get(int providerID);

    public ArrayList<Provider> search(String keyword);

    public boolean add(Provider Provider);

    public boolean update(Provider Provider);

    public boolean delete(int ProviderID);
}