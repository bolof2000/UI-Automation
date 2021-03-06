package com.ui.seleniumdesign.test.srp;

import com.ui.seleniumdesign.srp.pages.GoogleResultPage;
import com.ui.seleniumdesign.srp.pages.GoogleSearchPage;
import com.ui.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    /*
    Create pages that is required fir this tes
    create constructor to construct each pages
     */
    private GoogleSearchPage googleSearchPage;
    private GoogleResultPage googleResultPage;
    @BeforeTest
    public void pageSetups(){
        this.googleSearchPage = new GoogleSearchPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "getData")
    public void googleTestWorkFlow(String keyword,int index){
        goToUrl();
        Assert.assertTrue(googleSearchPage.getSearchWidget().isDisplayed());
        googleSearchPage.getSearchWidget().enterWordToSearch(keyword);
        googleSearchPage.getSearchSuggestion().clickSuggestionByIndex(index);
        Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());


        googleResultPage.getSearchWidget().enterWordToSearch(keyword);
        googleResultPage.getSearchSuggestion().clickSuggestionByIndex(index);
        googleResultPage.getNavigationBar().goToNews();
       System.out.println(googleResultPage.getResultStat().getStat());
    }
}
