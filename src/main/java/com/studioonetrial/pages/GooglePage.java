package com.studioonetrial.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.studioonetrial.helper.WaitHelper.getWait;

public class GooglePage extends PageBase{
    private final String url = "https://www.google.com/";

     @FindBy(css = ".RNNXgb textarea[type$='search']")
     private WebElement searchField;

     @FindBy(css = "cite[role$='text']")
     private List<WebElement> searchedUrlList;
     public GooglePage openPage(){
          openURL(url);
          return this;
     }

     public GooglePage typeInSearchField(String text){
          typeIn(searchField,text);
          return this;
     }

     public GooglePage pressEnterKeyOnSearchField(){
          pressEnterKey(searchField);
          getWait().sleep(1000);
          return this;
     }

     public String getSearchedUrlByPosition(int position){
          return readText(searchedUrlList,position);
     }


}
