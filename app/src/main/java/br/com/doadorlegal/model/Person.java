package br.com.doadorlegal.model;

import java.io.Serializable;

/**
 * Created by Giovanne on 17/05/2017.
 */

public class Person implements Serializable{
    private String name;
    private String cause;
    private String bloodType;
    private String location;
    private int pic;

    public Person(String name, String cause, String bloodType, String location, int pic) {
        this.name = name;
        this.cause = cause;
        this.bloodType = bloodType;
        this.location = location;
        this.pic = pic;
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

    public int getPic() {
        return pic;
    }
}
