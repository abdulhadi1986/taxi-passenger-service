package com.abdulraham.taxipassenger.services;

import com.abdulraham.taxipassenger.model.User;

import java.util.ArrayList;

public class UserServices {

    public ArrayList<User> users;

    public boolean verifyUserInfo(User user){
        if (user.getFirstName().trim().length()==0||user.getFirstName()==null)
            return false;
        if (user.getLastName().trim().length()==0||user.getLastName()==null)
            return false;
        if(user.getEmail()==null||user.getEmail().trim().length()==0||!user.getEmail().contains("@")||!user.getEmail().contains(".com"))
            return false;
        if(user.getPhoneNum()==null||user.getPhoneNum().contains(" ")||user.getPhoneNum().length()!=10)
            return false;

        return true;

    }

    public boolean addUser(User user){
        if(verifyUserInfo(user)==true) {
            users.add(user);
            return true;
        }
        return false;
    }

}
