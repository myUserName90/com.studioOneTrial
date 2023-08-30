package com.studioonetrial.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.studioonetrial.helper.WaitHelper.getWait;

public class DzenPage extends PageBase{

    private final String url = "https://zen.yandex.ru";

    @FindBy(css = ".dzen-search-arrow-common__frame")
    private WebElement yandexSearchFrame;

    @FindBy(css = ".arrow__input")
    private WebElement searchField;

    @FindBy(css = "form [class=\"arrow__button\"]")
    private WebElement searchBtn;

    public DzenPage openPage(){
        openURL(url);
        return this;
    }

    public DzenPage typeInSearchField(String text){
        switchToIframeElement(yandexSearchFrame);
        typeIn(searchField, text);
        return this;
    }

    public DzenPage clickOnSearchButton(){
        performClickByActions(searchBtn);
        getWait().sleep(2000);
        return this;
    }

    public YandexPage switchToYandexPage(){
        switchToTab(1);
        return new YandexPage().initElements();
    }



}
