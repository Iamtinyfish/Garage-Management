package com.tfgarage.model.ejb;

import com.tfgarage.model.ejb.interfaces.AccountEJBInterface;
import com.tfgarage.model.entity.Account;
import jakarta.ejb.Stateless;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Base64;

@Stateless
public class AccountEJB implements AccountEJBInterface {

    @Override
    public boolean checkLogin(String username, String password) {
        return true;
    }

    @Override
    public ArrayList<Account> getAll() {
        //TODO getAll account method
        return new ArrayList<Account>();
    }

    @Override
    public Account get(int accountID) {
        //TODO get 1 account method
        return new Account();
    }

    @Override
    public ArrayList<Account> search(String keyword) {
        //TODO search account method
        return new ArrayList<Account>();
    }

    @Override
    public boolean add(Account account) {
        //TODO add 1 account method
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

    private String hash(String password, String salt) {
        Base64.Encoder enc = Base64.getEncoder();
        Base64.Decoder dec = Base64.getDecoder();
        KeySpec spec = new PBEKeySpec(password.toCharArray(), dec.decode(salt), 65536, 128);
        SecretKeyFactory f;
        byte[] hash = new byte[0];
        try {
            f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            hash = f.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return enc.encodeToString(hash);
    }
}
