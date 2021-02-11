package com.ui.seleniumdesign.test.srp;

import com.ui.seleniumdesign.demoblazeautomation.HomePage;
import com.ui.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class LoginTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void testPositiveLogin(){
        this.homePage = new HomePage(driver);
        this.homePage.goToURL();
        homePage.getLoginComponent().doLogin("bolofbaba","Dammy2k100");  // bad coding for now data should come from excel or other sources
        Assert.assertTrue(this.homePage.getLoginComponent().validateSuccessfulLogin("bolofbaba"));
    }
}

