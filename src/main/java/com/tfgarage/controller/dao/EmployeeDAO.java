/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Employee
/**
 *
 * @author Nello
 */
public class EmployeeDAO extends DAO{
    public EmployeeDAO(){
        super();
    }
    public ArrayList<Employee> getEmployee(int id){
        ArrayList<Employee> result= new ArrayList<Employee>();
        String sql = "SELECT * FROM tblemployee WHERE id =?";
        try{
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1,""+id+"");
           ResultSet rs= ps.executeQuery();
           while(rs.next()){
               Employee employee= new Employee();
               employee.setId = (rs.getInt("id"));
               employee.setName = (rs.getString("name"));
               employee.setAge = (rs.getInt("age"));
               employee.setGender = (rs.getString("gender"));
               employee.setAddress = (rs.getString("address"));
               employee.setPhoneNum = (rs.getString("phoneNum"));
               employee.setEmail = (rs.getString("email"));
               employee.setIdCard = (rs.getString("idCard"));
               result.add(employee);
           }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
}
