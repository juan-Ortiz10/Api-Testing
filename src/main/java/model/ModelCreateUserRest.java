package model;

public class ModelCreateUserRest {
    private String name;
    private String job;

    public ModelCreateUserRest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":" + '\"' + name + '\"' +
                ", \"job\":" + '\"' + job + '\"' +
                '}';
    }
}
