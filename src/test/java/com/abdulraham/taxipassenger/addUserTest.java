package com.abdulraham.taxipassenger;

import com.abdulraham.taxipassenger.model.User;
import com.abdulraham.taxipassenger.services.UserServices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class addUserTest {

    @Test
    void check_add_user(){
        UserServices userServices = new UserServices();
        User user = new User();
        user.setFirstName("abed");
        user.setLastName("dahab");
        user.setEmail("abood@hotmail.com");
        user.setPhoneNum("0955227410");

        boolean isAdded = userServices.isUserAdded(user);
        assertTrue(isAdded);
    }

    @Test
    void check_add_user_when_name_is_empty(){
        UserServices userServices = new UserServices();
        User user = new User();
        user.setFirstName("");
        user.setLastName("dahab");
        user.setEmail("abood@hotmail.com");
        user.setPhoneNum("0955227410");

        boolean isAdded = userServices.isUserAdded(user);
        assertFalse(isAdded);
    }
    @Test
    void check_add_user_when_email_incorrect() {
        UserServices userServices = new UserServices();
        User user = new User();
        user.setFirstName("abed");
        user.setLastName("dahab");
        user.setEmail("abood.com");
        user.setPhoneNum("0955227410");
        boolean isAdded = userServices.isUserAdded(user);
        assertFalse(isAdded);
    }
    @Test
    void check_add_user_when_phone_number_incorrect(){
        UserServices userServices = new UserServices();
        User user = new User();
        user.setFirstName("abed");
        user.setLastName("dahab");
        user.setEmail("abood@hotmail.com");
        user.setPhoneNum("09552");

        boolean isAdded = userServices.isUserAdded(user);
        assertFalse(isAdded);
    }


}
