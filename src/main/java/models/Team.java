package models;

import java.util.Objects;

public class Team {
    String team_name;
    int dev_id;
    int team_id;

    public Team(String team_name, int dev_id) {
        this.team_name = team_name;
        this.dev_id = dev_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return dev_id == team.dev_id &&
                team_id == team.team_id &&
                Objects.equals(team_name, team.team_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team_name, dev_id, team_id);
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public int getDev_id() {
        return dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
