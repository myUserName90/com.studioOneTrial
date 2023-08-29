package com.studioonetrial.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.studioonetrial.config.DriverFactory.getDriver;
import static com.studioonetrial.helper.WaitHelper.getWait;

public class PageBase {
    protected void openURL(String url) {
        initElements();
        getDriver().get(url);
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }


    protected <T extends PageBase> T initElements() {
        PageFactory.initElements(getDriver(), this);
        return (T) this;
    }

    protected void typeIn(WebElement element, String text) {
        getWait().waitUntilElementToBeVisible(element);
        element.sendKeys(text);

    }
    protected void typeIn(List<WebElement> elements, int position, String text) {
        typeIn(elements.get(position - 1), text);
    }

    protected String readText(WebElement element) {
        return element.getText();
    }

    protected String readText(List<WebElement> elements, int position) {
        return readText(elements.get(position - 1));
    }


    protected void click(List<WebElement> elements, int position) {
        click(elements.get(position - 1));
    }

    protected void click(WebElement element) {
        getWait().waitUntilElementToBeClickable(element);
        element.click();
    }


    protected boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    protected void pressEnterKey(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }



}

