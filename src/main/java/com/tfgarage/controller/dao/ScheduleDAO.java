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
import model.Schedule;
/**
 *
 * @author Nello
 */
public class ScheduleDAO extends DAO{
    public ScheduleDAO(){
        super();
    }
    public ArrayList<Schedule> getAllSchedule(){
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }
    public ArrayList<Schedule> getSchedule(int id){
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }
    public boolean addSchedule(Schedule schedule){
        boolean result= true;
        return result;
    }
    public boolean deleteSchedule(Schedule schedule){
        boolean result= true;
        return result;
    }
    public boolean editSchedule(Schedule schedule){
        boolean result= true;
        return result;
    }
    public ArrayList<Schedule> searchSchedule(String key){
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }
}
