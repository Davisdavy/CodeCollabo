package dao;

import models.Developer;
import models.Job;
import models.Team;

import java.util.List;

public interface TeamDao {

    //create
    void add(Team team);

    //list and read all team
    List<Team> getAllTeam();

    //M:M r-ship
    void addDevToTeam(Team team, Developer developer);
    List<Developer> getAllDevBelongingToDepartment(int dev_id);

    //find and get Jobs of a team by id
    Team findById(int id);
    List<Job>getAllNews(int team_id);

    //Delete
    void deleteById(int id);
    void clearAll();
}
