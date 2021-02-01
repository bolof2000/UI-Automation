package com.ui.seleniumdesign.strategy.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAaccountComponent {

    private WebDriverWait wait;
    @FindBy(linkText = "Create Account")
    private WebElement createAccount;

    public CreateAaccountComponent(final WebDriver driver){
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);

    }

    public void clickCreateAccount(){
        createAccount.click();
    }

}
