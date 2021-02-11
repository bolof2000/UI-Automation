package com.ui.seleniumdesign.demoblazeautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginComponent extends CommonActionsAcrossPages{

    @FindBy(id="login2")
    private WebElement homeLoginButton;
    @FindBy(id="loginusername")
    private WebElement username;
    @FindBy(id="loginpassword")
    private WebElement password;
    @FindBy(xpath=".//button[text()=Log in]")
    private WebElement loginButton;
    @FindBy(id="nameofuser")
    private WebElement welcomeLoginMessage;
    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isDisplayed() {

    }

    public void doLogin(String username,String password){
        this.homeLoginButton.click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public boolean validateSuccessfulLogin(String username){
        return this.welcomeLoginMessage.getText().contains(username);

    }
}
