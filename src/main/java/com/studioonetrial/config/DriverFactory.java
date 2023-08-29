package com.studioonetrial.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static void initDriverObject() {
       driverPool.set(createChromeDriver());
    }

    public static WebDriver getDriver() {
        return driverPool.get();
    }


    public static void closeDrivers() {
        getDriver().quit();
        driverPool.remove();
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
