package tests;

import base.TestBase;
import com.studioonetrial.pages.DzenPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DzenTests extends TestBase {

    @Test(description = "Verify searching functionality.")
    public void verifySearch(){
       String actualUrl =  new DzenPage()
                .openPage()
                .typeInSearchField("facebook")
                .clickOnSearchButton()
                .switchToYandexPage()
                .getUrlsBy(1);

        Assert.assertEquals(actualUrl,"ru-ru.facebook.com");

    }}

