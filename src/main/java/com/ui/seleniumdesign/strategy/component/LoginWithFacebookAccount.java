package com.ui.seleniumdesign.strategy.component;

import com.ui.seleniumdesign.strategy.common.SignUpOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.util.Map;

public class LoginWithFacebookAccount implements SignUpOptions {
 private WebDriverWait wait;
    @FindBy(className= "link__Mcl7")
    private WebElement facebookLink;


    @FindBy(name= "email")
    private WebElement email;

    @FindBy(name= "pass")
    private WebElement password;


    @FindBy(name= "login")
    private WebElement loginButton;

    public LoginWithFacebookAccount(final WebDriver driver){
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver,40);
    }

    @Override
    public void signUpInformation(@Nullable String username,String email, String password, @Nullable String password2) {
        this.facebookLink.click();
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginButton.click();


    }

    @Override
    public boolean isDisplayed()
        {
            return  wait.until((d) -> this.email.isDisplayed()) ;
        }

}
