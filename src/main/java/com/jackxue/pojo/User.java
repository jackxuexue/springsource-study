package com.jackxue.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String userName;
    private String password;
    @Autowired(required = false)
    private Car car;

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
