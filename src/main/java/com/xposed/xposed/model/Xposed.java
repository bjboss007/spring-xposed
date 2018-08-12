package com.xposed.xposed.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Xposed extends AbstractEntity {


    private String firstName;

    private String middleName;

    private String lastName;

    private String location;


    public Xposed(){

    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

}