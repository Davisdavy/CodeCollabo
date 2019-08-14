package models;

import java.util.Objects;

public class Developer {
    String dev_name;
    String dev_link;
    int dev_id;

    public Developer(String dev_name, String dev_link) {
        this.dev_name = dev_name;
        this.dev_link = dev_link;
    }

    public int getDev_id() {
        return dev_id;
    }

    public void setDev_id(int dev_id) {
        this.dev_id = dev_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return dev_id == developer.dev_id &&
                Objects.equals(dev_name, developer.dev_name) &&
                Objects.equals(dev_link, developer.dev_link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dev_name, dev_link, dev_id);
    }

    public String getDev_name() {
        return dev_name;
    }

    public void setDev_name(String dev_name) {
        this.dev_name = dev_name;
    }

    public String getDev_link() {
        return dev_link;
    }

    public void setDev_link(String dev_link) {
        this.dev_link = dev_link;
    }

}
