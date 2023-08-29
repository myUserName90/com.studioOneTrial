package tests;

import base.TestBase;
import com.studioonetrial.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTests extends TestBase {
    @Test
    public void test(){
       String actualUrl = new GooglePage()
                .openPage()
                .typeInSearchField("Nike")
                .pressEnterKeyOnSearchField()
                .getSearchedUrlByPosition(1);
        Assert.assertEquals(actualUrl,"https://www.nike.com");
    }
}
