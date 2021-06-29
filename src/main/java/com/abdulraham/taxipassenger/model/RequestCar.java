package com.abdulraham.taxipassenger.model;


import java.time.LocalDateTime;
import java.util.ArrayList;

public class RequestCar {

    private User user;
    private int numberOfPassengers;
    private LocalDateTime requestDate;
    private ArrayList<String> fromWhere;
    private ArrayList<String> toWhere;


    public RequestCar(){};

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
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
