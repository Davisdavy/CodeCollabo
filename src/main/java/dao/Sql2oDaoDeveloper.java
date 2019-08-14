package dao;

import models.Developer;
import models.Team;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oDaoDeveloper implements DeveloperDao{
    private final Sql2o sql2o;
    public  Sql2oDaoDeveloper(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Developer developer) {

    }

    @Override
    public List<Developer> getAllDeveloper() {
        return null;
    }

    @Override
    public Developer findById(int id) {
        return null;
    }

    @Override
    public void addDeveloperToTeam(Developer developer, Team team) {

    }

    @Override
    public List<Team> getAllTeamBelongingToDeveloper(int dev_id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
