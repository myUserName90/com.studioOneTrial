package com.studioonetrial.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static com.studioonetrial.config.DriverFactory.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitHelper {
    private static final int TIMEOUT = 30;
    private static final int SHORT_TIMEOUT = 20;
    private static final int LONG_TIMEOUT = 60;
    private static WebDriverWait wait;

    private WaitHelper() {
    }

    public static WaitHelper getWait() {
        return getCustomWait(TIMEOUT);
    }

    public static WaitHelper getLongWait() {
        return getCustomWait(LONG_TIMEOUT);
    }

    public static WaitHelper getShortWait() {
        return getCustomWait(SHORT_TIMEOUT);
    }

    private static WaitHelper getCustomWait(int timeOut) {
        WaitHelper waitHandler = new WaitHelper();
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOut), Duration.ofMillis(50));
        return waitHandler;
    }

    public void sleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            //ignore
        }
    }

    public WebElement waitUntilElementToBeVisible(WebElement element) {
        return wait.until(visibilityOf(element));
    }
    public List<WebElement> waitUntilElementListToBeVisible(List<WebElement> elements) {
        return wait.until(visibilityOfAllElements(elements));
    }

    public WebElement waitUntilElementToBeClickable(WebElement element) {
        return wait.until(elementToBeClickable(element));
    }



}
