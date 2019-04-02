package com.hgc.demo;

import java.util.Date;

public class Person {
    private String username;
    private String password;
    private Date birth;
    private Boolean gender;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String username, String password, Date birth) {
        this.username = username;
        this.password = password;
        this.birth = birth;
    }
}
