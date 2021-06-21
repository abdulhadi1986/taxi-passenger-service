package com.abdulraham.taxipassenger.util;

import com.abdulraham.taxipassenger.model.User;

public class ValidationUtil {

    public boolean isValid(User userObject) {

        if (userObject == null) {
            return false;
        }
        if (userObject.getEmail() == null || userObject.getEmail().trim().length() == 0 ) {
            return false;
        }
        if (userObject.getPhoneNum() == null || userObject.getPhoneNum().trim().length() < 10) {
            return false;
        }

        return true;
    }
}
