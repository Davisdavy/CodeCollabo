package dao;

import models.Job;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oDaoJob implements JobDao {

    private final Sql2o sql2o;
    public Sql2oDaoJob(Sql2o sql2o) {
        this.sql2o = sql2o;

    }

    @Override
    public void add(Job job) {

    }

    @Override
    public List<Job> getAllJob() {
        return null;
    }

    @Override
    public Job findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void clearAll() {

    }
}
