package models;

import java.util.Objects;

public class Job {
    String job_name;
    int dev_id;
    int job_id;
    String job_requirements;

    public Job(String job_name, int dev_id, String job_requirements) {
        this.job_name = job_name;
        this.dev_id = dev_id;
        this.job_requirements = job_requirements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return dev_id == job.dev_id &&
                job_id == job.job_id &&
                Objects.equals(job_name, job.job_name) &&
                Objects.equals(job_requirements, job.job_requirements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job_name, dev_id, job_id, job_requirements);
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public int getDev_id() {
        return dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getJob_requirements() {
        return job_requirements;
    }

    public void setJob_requirements(String job_requirements) {
        this.job_requirements = job_requirements;
    }
}
