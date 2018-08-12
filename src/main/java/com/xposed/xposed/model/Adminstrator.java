package com.xposed.xposed.model;

import javax.persistence.Entity;

@Entity
public class Adminstrator extends AbstractEntity {

    private String userName;

    private String password;


    public Adminstrator() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
