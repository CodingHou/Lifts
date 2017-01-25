package com.hou.model;

/**
 * Created by houchao on 2017/1/9.
 */
public class User {
    private int id;
    private String name;
    private String password;

    public User(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
