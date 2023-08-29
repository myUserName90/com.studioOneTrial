package com.studioonetrial.pages;

public class YandexPage extends PageBase{

    private String url = "https//:zen.yandex.ru";

    public YandexPage openPage(){
        openURL(url);
        return this;
    }


}
