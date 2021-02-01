package com.ui.seleniumdesign.test.signup;

import com.ui.seleniumdesign.strategy.common.SignUpOptions;
import com.ui.seleniumdesign.strategy.component.SignUpWithEmail;
import com.ui.seleniumdesign.strategy.pages.HomePage;
import com.ui.seleniumdesign.strategy.pages.SignUpPage;
import com.ui.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpTest extends BaseTest {
    private HomePage homePage;
    private SignUpPage signUpPage;

    @BeforeTest
    public void setSignUpPage(){
        this.homePage = new HomePage(driver);
        this.signUpPage = new SignUpPage(driver);

    }

    @Test
    public void signUpTestWithWithEmailAndPassword(){
        goToUrl();
        this.homePage.getCreateAaccountComponent().clickCreateAccount();
        this.signUpPage.getSignUpOptions().isDisplayed();
       // this.signUpPage.setSignUpOptions(new SignUpWithEmail(driver));
        this.signUpPage.getSignUpOptions().signUpInformation("bolofbaba","Dammy2k100","Dammy2k100",
        "bolofbaba@gmail.com");



    }

}
