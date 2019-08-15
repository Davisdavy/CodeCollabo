package dao;


import models.Team;
import org.sql2o.Sql2o;
import models.Developer;

import java.util.List;

public class Sql2oDaoTeam implements TeamDao {

    private final Sql2o sql2o;
    public Sql2oDaoTeam(Sql2o sql2o) {
        this.sql2o = sql2o;

    }

    @Override
    public void add(Team team) {

    }

    @Override
    public List<Team> getAllTeam() {
        return null;
    }

    @Override
    public void addDevToTeam(Team team, Developer developer) {

    }

    @Override
    public List<Developer> getAllDevBelongingToDepartment(int dev_id) {
        return null;
    }

    @Override
    public Team findById(int id) {
        return null;
    }

    @Override
    public List<Job> getAllNews(int team_id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
