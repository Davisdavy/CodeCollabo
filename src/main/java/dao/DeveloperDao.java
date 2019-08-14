package dao;

import models.Developer;
import models.Team;

import java.util.List;

public interface DeveloperDao {
    void add(Developer developer);

    List<Developer> getAllDeveloper();
    Developer findById(int id);

    void addDeveloperToTeam(Developer developer, Team team);
    List<Team>getAllTeamBelongingToDeveloper(int dev_id);

    void deleteById(int id);

    //clear
    void clearAll();

}
