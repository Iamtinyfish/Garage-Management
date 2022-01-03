/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.tfgarage.model.Employee;
/**
 *
 * @author Nello
 */
public class EmployeeDAO  extends DAO{
    public EmployeeDAO(){
        super();
    }

    public ArrayList<Employee> get(int employeeID){
        ArrayList<Employee> result= new ArrayList<Employee>();
        String sql = "SELECT * FROM tblemployee WHERE id = ?";
        try{
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,"" + employeeID + "");
           ResultSet rs= ps.executeQuery();
           while(rs.next()){
               Employee employee= new Employee();
//               employee.setId = (rs.getInt("id"));
//               employee.setName = (rs.getString("name"));
//               employee.setAge = (rs.getInt("age"));
//               employee.setGender = (rs.getString("gender"));
//               employee.setAddress = (rs.getString("address"));
//               employee.setPhoneNum = (rs.getString("phoneNum"));
//               employee.setEmail = (rs.getString("email"));
//               employee.setIdCard = (rs.getString("idCard"));
               result.add(employee);
           }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Employee> getAll() {
        //TODO getAll employee method
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        return employeeList;
    }

    public ArrayList<Employee> search(String keyword) {
        //TODO search employee method
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        return employeeList;
    }

    public boolean add(Employee employee) {
        //TODO add 1 employee method
        return true;
    }

    public boolean update(Employee employee) {
        //TODO update 1 employee method
        return true;
    }

    public boolean delete(int employeeID) {
        //TODO delete 1 employee method
        return true;
    }
    
}
