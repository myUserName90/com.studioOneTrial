package com.studioonetrial.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YandexPage extends PageBase{

    @FindBy(css = ".Path-Item b")
    private List<WebElement> urls;

    public String getUrlsBy(int position){
       return readText(urls,position);
    }

}
