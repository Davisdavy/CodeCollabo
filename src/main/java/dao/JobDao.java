package dao;

import models.Job;

import java.util.List;

public interface JobDao {

    //create
    void add(Job job);

    //Get and find all employees ...by id
    List<Job> getAllJob();
    Job findById(int id);

    //delete
    void deleteById(int id);

    //clear
    void clearAll();
}
