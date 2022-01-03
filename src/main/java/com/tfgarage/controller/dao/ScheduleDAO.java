/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfgarage.controller.dao;

import java.util.ArrayList;

import com.tfgarage.model.Schedule;

/**
 * @author Nello
 */
public class ScheduleDAO extends DAO {
    public ScheduleDAO() {
        super();
    }

    public ArrayList<Schedule> getAll() {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    public ArrayList<Schedule> get(int scheduleID) {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    public boolean add(Schedule schedule) {
        boolean result = true;
        return result;
    }

    public boolean delete(int scheduleID) {
        boolean result = true;
        return result;
    }

    public boolean update(Schedule schedule) {
        boolean result = true;
        return result;
    }

    public ArrayList<Schedule> search(String keyword) {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    public ArrayList<Schedule> getNewSchedule() {
        ArrayList<Schedule> result = new ArrayList<Schedule>();
        return result;
    }

    public boolean reviewSchedule(int scheduleID, boolean isAccept) {
        boolean result = true;
        return result;
    }
}
