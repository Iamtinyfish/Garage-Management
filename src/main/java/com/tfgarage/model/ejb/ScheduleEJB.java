package com.tfgarage.model.ejb;

import com.tfgarage.model.entity.Schedule;

import java.util.ArrayList;

public class ScheduleEJB implements ScheduleEJBInterface{
    
    @Override
    public ArrayList<Schedule> getAll() {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    @Override
    public ArrayList<Schedule> get(int scheduleID) {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    @Override
    public boolean add(Schedule schedule) {
        boolean result = true;
        return result;
    }

    @Override
    public boolean delete(int scheduleID) {
        boolean result = true;
        return result;
    }

    @Override
    public boolean update(Schedule schedule) {
        boolean result = true;
        return result;
    }

    @Override
    public ArrayList<Schedule> search(String keyword) {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    @Override
    public ArrayList<Schedule> getNewSchedule() {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    @Override
    public boolean reviewSchedule(int scheduleID, boolean isAccept) {
        boolean result = true;
        return result;
    }
}
