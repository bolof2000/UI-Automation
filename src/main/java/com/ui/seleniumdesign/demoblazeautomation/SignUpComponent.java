package com.ui.seleniumdesign.demoblazeautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpComponent extends CommonActionsAcrossPages {

      public SignUpComponent(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="sign-username")
    private WebElement username;
    @FindBy(id="sign-password")
    private WebElement password;

    @FindBy(xpath = ".//button[text()=sign Up")
    private WebElement signUpButton;

    @FindBy(xpath = ".//button[text()=close")
    private WebElement closeButton;


    @Override
    public void isDisplayed() {

    }

    public void signUp(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.signUpButton.click();
    }

}
