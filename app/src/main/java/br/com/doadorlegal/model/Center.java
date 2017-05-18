package br.com.doadorlegal.model;

import java.io.Serializable;

/**
 * Created by Giovanne on 17/05/2017.
 */

public class Center implements Serializable{
    private String name;
    private String description;
    private String bloodType;
    private String location;
    private String funcTime;
    private String funcDays;

    public Center(String name, String description, String bloodType, String location, String funcTime, String funcDays) {
        this.name = name;
        this.description = description;
        this.bloodType = bloodType;
        this.location = location;
        this.funcTime = funcTime;
        this.funcDays = funcDays;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getLocation() {
        return location;
    }

    public String getFuncTime() {
        return funcTime;
    }

    public String getFuncDays() {
        return funcDays;
    }
}
