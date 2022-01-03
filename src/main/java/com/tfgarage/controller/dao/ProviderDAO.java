/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tfgarage.model.Provider;
/**
 *
 * @author Nello
 */
public class ProviderDAO extends DAO{
    public ProviderDAO(){
        super();
    }
    public List<Provider> getAll(){
        List<Provider> result = new ArrayList<Provider>();
        String sql = "SELECT * FROM tblprovider";
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            
            while(rs.next()){
                Provider provider= new Provider();
                provider.setId(rs.getInt("id"));
                provider.setName(rs.getString("name"));
                provider.setAddress(rs.getString("address"));
                provider.setPhoneNum(rs.getString("phoneNum"));
                result.add(provider);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<Provider> get(int id){
        ArrayList<Provider> result = new ArrayList<Provider>();
        String sql = "SELECT * FROM tblprovider WHERE id=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "" + id+ "" );
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Provider provider= new Provider();
                provider.setId(rs.getInt("id"));
                provider.setName(rs.getString("name"));
                provider.setAddress(rs.getString("address"));
                provider.setPhoneNum(rs.getString("phoneNum"));
                result.add(provider);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public boolean add(Provider provider){
        boolean result = true;
        String sql = "INSERT INTO tblprovider(name, address, phonenum) VALUES(?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,provider.getName());
            ps.setString(2, provider.getAddress());
            ps.setString(3,provider.getPhoneNum());
            ps.executeUpdate();
            //get id of the new inserted client
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                provider.setId(generatedKeys.getInt(1));
            }
        }catch(Exception e){
            e.printStackTrace();
            result = false;
        }
        return result;
    }
    public boolean delete(int providerID){
        boolean result = true;
        return result;
    }
    public boolean update(Provider provider){
        boolean result = true;
        return result;
    }
    public List<Provider> search(String keyword){
        List<Provider> result = new ArrayList<Provider>();
        return result;
    }
}
