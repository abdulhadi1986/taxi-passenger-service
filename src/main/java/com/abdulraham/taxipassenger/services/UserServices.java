package com.abdulraham.taxipassenger.services;

import com.abdulraham.taxipassenger.model.User;
import com.abdulraham.taxipassenger.repository.UserRepo;
import com.abdulraham.taxipassenger.utilty.Utilities;

public class UserServices {

    public boolean isUserAdded(User user) {
        Utilities ob = new Utilities();
        UserRepo userRepo = new UserRepo();

        if (ob.isString(user.getFirstName()) && ob.isString(user.getLastName())
                && ob.isEmail(user.getEmail()) && ob.isPhoneNum(user.getPhoneNum())) {
            userRepo.addUser(user);
            return true;
        }
        return false;

    }
}
