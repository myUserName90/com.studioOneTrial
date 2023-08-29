package com.studioonetrial.dataprovider;

import org.testng.annotations.DataProvider;

public class GoogleData {

    @DataProvider(name = "Google search data")
    public static Object[][] googleData() {
        return new Object[][]{
                {"Nike", "https://www.nike.com"},
                {"Adidas", "https://www.adidas.com"},
                {"BMW", "https://www.bmw.com"}

        };
    }

}
