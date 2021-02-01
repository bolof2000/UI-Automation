package com.ui.seleniumdesign.test.signup;

import com.ui.seleniumdesign.strategy.common.SignUpOptions;
import com.ui.seleniumdesign.strategy.component.SignUpWithEmail;
import com.ui.seleniumdesign.strategy.pages.HomePage;
import com.ui.seleniumdesign.strategy.pages.SignUpPage;
import com.ui.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        goToUrl("www.leetcode.com");
        this.homePage.getCreateAaccountComponent();
        this.signUpPage.setSignUpOptions(new SignUpWithEmail(driver));
        this.signUpPage.getSignUpOptions().signUpInformation("bolofbaba","Dammy2k100","Dammy2k100",
        "bolofbaba@gmail.com");



    }

}
