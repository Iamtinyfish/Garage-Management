/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Service
/**
 *
 * @author Nello
 */
public class ServiceDAO extends DAO{
    public ServiceDAO(){
        super();
    }
    public ArrayList<Service> getAll(){
        ArrayList<Service> result = new ArrayList<Service>();
        return result;
    }
    public ArrayList<Service> getAcces(int id){
        ArrayList<Service> result = new ArrayList<Service>();
        return result;
    }
    public ArrayList<Service> searchAccess(String key){
        ArrayList<Service> result = new ArrayList<Service>();
        return result;
    }
}
