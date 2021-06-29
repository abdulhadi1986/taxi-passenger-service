package com.abdulraham.taxipassenger.services;

import com.abdulraham.taxipassenger.model.Driver;

import java.util.ArrayList;

public class DriverServices {
    public static ArrayList<Driver> drivers=new ArrayList<Driver>();




    public static boolean verify(Driver ob){
        if(ob.getFirstName()==null||ob.getFirstName().trim().length()==0)
            return false;
         if (ob.getLastName()==null|| ob.getLastName().trim().length()==0)
            return false;
         if(ob.getEmail()==null||ob.getEmail().trim().length()==0||!ob.getEmail().contains("@")||!ob.getEmail().contains(".com"))
            return false;
         if(ob.getPhoneNum().length()!=10||ob.getPhoneNum()==null)
            return false;
         if(ob.getUserName().trim().length()==0||ob.getUserName()==null)
             return  false;
         if(ob.getPassword().trim().length()<8||ob.getPassword()==null||ob.getPassword().contains(" "))
             return  false;
        return true;

    }

     public static boolean addDriver(Driver driver){
        if(verify(driver)==true){
            drivers.add(driver);
            return true;
        }
            return false;
    }




}
