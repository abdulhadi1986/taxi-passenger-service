package com.abdulraham.taxipassenger.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.abdulraham.taxipassenger.model.User;

class ValidationUtilTest {

    @Test
    void check_valid_object() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = new User();
        user.setEmail("testemail");
        user.setPhoneNum("1234567890");

        boolean isValid = validationUtil.isValid(user);

        assertTrue(isValid);
    }

    @Test
    void check_when_email_isNull() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = new User();
        user.setPhoneNum("1234567890");

        boolean isValid = validationUtil.isValid(user);

        assertFalse(isValid);
    }

    @Test
    void check_when_phoneNum_isShort() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = new User();
        user.setPhoneNum("12345678");
        boolean isValid = validationUtil.isValid(user);
        assertFalse(isValid);
    }

    @Test
    void check_when_user_isNull() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = null;
        boolean isValid = validationUtil.isValid(user);
        assertFalse(isValid);
    }

    @Test
    void check_when_phoneNum_isNull() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = new User();
        user.setEmail("testEmail");
        boolean isValid = validationUtil.isValid(user);
        assertFalse(isValid);
    }

    @Test
    void check_when_email_isEmpty() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = new User();
        user.setEmail("");
        user.setPhoneNum("1234567890");
        boolean isValid = validationUtil.isValid(user);
        assertFalse(isValid);
    }

    @Test
    void check_when_email_onlySpaces() {
        ValidationUtil validationUtil = new ValidationUtil();
        User user = new User();
        user.setEmail("    ");
        user.setPhoneNum("1234567890");
        boolean isValid = validationUtil.isValid(user);
        assertFalse(isValid);
    }
}
