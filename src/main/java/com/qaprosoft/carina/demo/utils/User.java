package com.qaprosoft.carina.demo.utils;

public class User {
    private String email;
    private String password;
    private String wrongEmail;

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWrongEmail(){ return wrongEmail;}

    public void setWrongEmail(String wrongEmail) { this.wrongEmail = wrongEmail;}

}
