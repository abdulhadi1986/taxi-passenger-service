package com.abdulraham.taxipassenger.services;

import com.abdulraham.taxipassenger.model.Driver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationDriverServicesTest {

    @Test
    void check_add_driver(){
        Driver driver=new Driver();
        driver.setFirstName("abed ulhadi");
        driver.setLastName("abo zahab");
        driver.setPhoneNum("0936414766");
        driver.setEmail("abed.zahab@hotmail.com");
        driver.setUserName("abood");
        driver.setPassword("abedzahab");
        boolean addDriver = DriverServices.addDriver(driver);

        assertTrue(addDriver);

    }

    @Test
    void check_add_driver_when_name_is_null(){
        Driver driver=new Driver();
        driver.setLastName("dahab");
        driver.setEmail("abed@hotmail.com");
        driver.setPhoneNum("0955227410");
        driver.setUserName("abed");
        driver.setPassword("asdf");

        boolean addDriver = DriverServices.addDriver(driver);
        assertFalse(addDriver);
    }

    @Test
    void check_add_driver_when_name_is_empty(){
        Driver driver=new Driver();
        driver.setFirstName("");
        driver.setLastName("dahab");
        driver.setEmail("abed@hotmail.com");
        driver.setPhoneNum("0955227410");
        driver.setUserName("abed");
        driver.setPassword("asdf");

        boolean addDriver = DriverServices.addDriver(driver);
        assertFalse(addDriver);
    }

    @Test
    void check_when_email_is_false(){
        Driver driver=new Driver();
        driver.setFirstName("abed ulhadi");
        driver.setLastName("abo zahab");
        driver.setPhoneNum("0936414766");
        driver.setEmail("abed.zahab.com");
        driver.setUserName("abood");
        driver.setPassword("abedzahab");
        boolean addDriver = DriverServices.addDriver(driver);
        assertFalse(addDriver);

    }

    @Test
    void chek_when_password_contain_space(){
        Driver driver=new Driver();
        driver.setFirstName("abed ulhadi");
        driver.setLastName("abo zahab");
        driver.setPhoneNum("0936414766");
        driver.setEmail("abed.zahab@hotmail.com");
        driver.setUserName("abood");
        driver.setPassword("abedz a hab");
        boolean addDriver = DriverServices.addDriver(driver);
        assertFalse(addDriver);


    }


}
