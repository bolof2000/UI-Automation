package com.ui.seleniumdesign.strategy.component;

import com.ui.seleniumdesign.strategy.common.SignUpOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;

public class SignUpWithEmail implements SignUpOptions {

    private static WebDriverWait wait ;
    @FindBy(name= "username")
    private WebElement username;

    @FindBy(name= "password1")
    private WebElement passwordOne;

    @FindBy(name= "passwordY")
    private WebElement passwordTwo;
    @FindBy(name= "email")
    private WebElement email;
    @FindBy(name= "signup_btn")
    private WebElement signUpButton;

    public SignUpWithEmail(final WebDriver driver){
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver,40);

    }

    @Override
    public void signUpInformation(@Nullable String username, String email, String password1, @Nullable String password2) {
        this.username.sendKeys(username);
        this.passwordOne.sendKeys(password1);
        this.passwordTwo.sendKeys(password2);
        this.email.sendKeys(email);
        this.signUpButton.click();
    }
    public boolean isDisplayed() {
        return  wait.until((d) -> this.username.isDisplayed()) ;
    }
}
