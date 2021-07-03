package com.abdulraham.taxipassenger;

import com.abdulraham.taxipassenger.model.Driver;
import com.abdulraham.taxipassenger.services.DriverServices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class addDriverTest {

    @Test
    void check_add_driver() {
        DriverServices driverServices = new DriverServices();
        Driver driver = new Driver();
        driver.setFirstName("abed");
        driver.setLastName("dahab");
        driver.setEmail("abood@hotmail.com");
        driver.setUserName("aboAlZahab");
        driver.setPassword("abcdefgh");
        driver.setPhoneNum("0955227410");

        boolean isAdded = driverServices.isDriverAdded(driver);
        assertTrue(isAdded);

    }

    @Test
    void check_add_driver_when_name_is_null() {
        DriverServices driverServices = new DriverServices();
        Driver driver = new Driver();

        driver.setLastName("dahab");
        driver.setEmail("abood@hotmail.com");
        driver.setUserName("aboAlZahab");
        driver.setPassword("abcdefgh");
        driver.setPhoneNum("0955227410");

        boolean isAdded = driverServices.isDriverAdded(driver);
        assertFalse(isAdded);

    }

    @Test
    void check_add_driver_when_password_is_space() {
        DriverServices driverServices = new DriverServices();
        Driver driver = new Driver();
        driver.setFirstName("abed");
        driver.setLastName("dahab");
        driver.setEmail("abood@hotmail.com");
        driver.setUserName("aboAlZahab");
        driver.setPassword(" ");
        driver.setPhoneNum("0955227410");

        boolean isAdded = driverServices.isDriverAdded(driver);
        assertFalse(isAdded);

    }

    @Test
    void check_add_driver_when_email_is_incorrect() {
        DriverServices driverServices = new DriverServices();
        Driver driver = new Driver();
        driver.setFirstName("abed");
        driver.setLastName("dahab");
        driver.setEmail("abood");
        driver.setUserName("aboAlZahab");
        driver.setPassword("abcdefgh");
        driver.setPhoneNum("0955227410");

        boolean isAdded = driverServices.isDriverAdded(driver);
        assertFalse(isAdded);

    }

    @Test
    void check_add_driver_when_phone_number_is_not_real() {
        DriverServices driverServices = new DriverServices();
        Driver driver = new Driver();
        driver.setFirstName("abed");
        driver.setLastName("dahab");
        driver.setEmail("abood@hotmail.com");
        driver.setUserName("aboAlZahab");
        driver.setPassword("abcdefgh");
        driver.setPhoneNum("095520");

        boolean isAdded = driverServices.isDriverAdded(driver);
        assertFalse(isAdded);

    }


}
