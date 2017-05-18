package br.com.doadorlegal.model;

/**
 * Created by Giovanne on 17/05/2017.
 */

public class Person {
    private String name;
    private String cause;
    private String bloodType;
    private String location;

    public Person(String name, String cause, String bloodType, String location) {
        this.name = name;
        this.cause = cause;
        this.bloodType = bloodType;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getLocation() {
        return location;
    }
}
