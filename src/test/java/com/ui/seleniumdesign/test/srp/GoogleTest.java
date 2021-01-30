package com.ui.seleniumdesign.test.srp;

import com.ui.seleniumdesign.srp.GoogleResultPage;
import com.ui.seleniumdesign.srp.GoogleSearchPage;
import com.ui.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

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

    @Test
    public void googleTestWorkFlow(){
        goToUrl("https://www.google.com");
        Assert.assertTrue(googleSearchPage.getSearchWidget().isDisplayed());
    }
}
