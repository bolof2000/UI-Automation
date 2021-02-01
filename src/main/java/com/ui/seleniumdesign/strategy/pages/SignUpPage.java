package com.ui.seleniumdesign.strategy.pages;

import com.ui.seleniumdesign.strategy.common.SignUpOptions;
import com.ui.seleniumdesign.strategy.component.CreateAaccountComponent;
import com.ui.seleniumdesign.strategy.component.LoginWithFacebookAccount;
import com.ui.seleniumdesign.strategy.component.LoginWithGithubAccount;
import com.ui.seleniumdesign.strategy.component.SignUpWithEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    private WebDriver driver;

    private CreateAaccountComponent createAaccountComponent;
    private SignUpOptions signUpOptions;


    public SignUpPage(final WebDriver driver){
        this.driver = driver;
        this.createAaccountComponent = PageFactory.initElements(driver,CreateAaccountComponent.class);
        this.signUpOptions = new LoginWithFacebookAccount(driver);
        this.signUpOptions = new SignUpWithEmail(driver);
        this.signUpOptions = new LoginWithGithubAccount(driver);

    }

   public CreateAaccountComponent getCreateAaccountComponent() {
        return createAaccountComponent;
    }

    public void setSignUpOptions(SignUpOptions signUpOptions) {
        this.signUpOptions = signUpOptions;
        PageFactory.initElements(driver,this.signUpOptions);

    }

    public SignUpOptions getSignUpOptions() {
        return signUpOptions;
    }

}
