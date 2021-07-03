package com.abdulraham.taxipassenger.services;

import com.abdulraham.taxipassenger.model.Driver;
import com.abdulraham.taxipassenger.repository.DriverRepo;
import com.abdulraham.taxipassenger.utilty.Utilities;

public class DriverServices {


    public boolean isDriverAdded(Driver driver) {
        Utilities ob = new Utilities();
        DriverRepo driverRepo = new DriverRepo();
        if (ob.isString(driver.getFirstName()) && ob.isString(driver.getLastName())
                && ob.isEmail(driver.getEmail()) && ob.isPassword(driver.getPassword())
                && ob.isPhoneNum(driver.getPhoneNum()) && ob.isString(driver.getUserName())) {

            driverRepo.addDriverToRepo(driver);
            return true;
        }


        return false;
    }


}
