package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import static com.studioonetrial.config.DriverFactory.closeDrivers;
import static com.studioonetrial.config.DriverFactory.initDriverObject;


public class TestBase {
        @BeforeMethod
        public void setUp() {
        initDriverObject();
        }

        @AfterMethod
        public void closeBrowser() {
            closeDrivers();
        }
    }

