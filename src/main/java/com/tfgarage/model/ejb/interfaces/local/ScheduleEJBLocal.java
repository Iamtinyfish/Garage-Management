package com.tfgarage.model.ejb.interfaces.local;

import com.tfgarage.model.entity.Schedule;
import jakarta.ejb.Local;

import java.util.ArrayList;

@Local
public interface ScheduleEJBLocal {
    public ArrayList<Schedule> getAll();

    public ArrayList<Schedule> get(int scheduleID);

    public boolean add(Schedule schedule);

    public boolean delete(int scheduleID);

    public boolean update(Schedule schedule);

    public ArrayList<Schedule> search(String keyword);

    public ArrayList<Schedule> getNewSchedule();

    public boolean reviewSchedule(int scheduleID, boolean isAccept);
}