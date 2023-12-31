package com.takeo.userservlet.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private String address;

    public User(String id, String name, String address) {
    }

    public int getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
