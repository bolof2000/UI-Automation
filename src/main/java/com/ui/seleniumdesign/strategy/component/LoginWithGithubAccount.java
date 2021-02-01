package com.ui.seleniumdesign.strategy.component;

import com.ui.seleniumdesign.strategy.common.SignUpOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.annotation.Nullable;
import java.util.Map;

public class LoginWithGithubAccount implements SignUpOptions {

    @FindBy(className= "link__Mcl7")
    private WebElement githubLink;


    @FindBy(name= "login")
    private WebElement username;

    @FindBy(name= "password")
    private WebElement password;


    @FindBy(name= "commit")
    private WebElement loginButton;

    public LoginWithGithubAccount(final WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @Override
    public void signUpInformation(@Nullable String username,String email, String password, @Nullable String password2) {

        this.githubLink.click();
        this.username.sendKeys(email);
        this.password.sendKeys(password);
        this.loginButton.click();


    }

    @Override
    public boolean isDisplayed() {
        return false;
    }
}
