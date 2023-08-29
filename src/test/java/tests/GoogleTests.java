package tests;

import base.TestBase;
import com.studioonetrial.dataprovider.GoogleData;
import com.studioonetrial.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTests extends TestBase {


    @Test(description = "Verification of searched brands Web site URl positions",
            dataProvider = "Google search data",
            dataProviderClass = GoogleData.class)
    public void verifySearchFunctionalityBySuggestedUrl(String searchedValue, String expectedUrl){
       boolean isContains = new GooglePage()
                .openPage()
                .typeInSearchField(searchedValue)
                .pressEnterKeyOnSearchField()
                .getSearchedUrlByPosition(1).contains(expectedUrl);

        Assert.assertTrue(isContains, "Searched result is not valid.");
    }
}
