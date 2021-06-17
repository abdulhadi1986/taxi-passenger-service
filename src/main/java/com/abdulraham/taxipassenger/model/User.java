package com.abdulraham.taxipassenger.model;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
public class User {
    private String firstNAme;
    private String lastName;
    private String phoneNum;
    private String email;
    private ArrayList<String> fromWhere = new ArrayList<String>();
    private ArrayList<String> toWhere = new ArrayList<String>();


    public User(){};

    public String getFirstNAme() {
        return firstNAme;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getFromWhere() {
        return fromWhere;
    }

    public void setFromWhere(ArrayList<String> fromWhere) {
        this.fromWhere = fromWhere;
    }

    public ArrayList<String> getToWhere() {
        return toWhere;
    }

    public void setToWhere(ArrayList<String> toWhere) {
        this.toWhere = toWhere;
    }


}
