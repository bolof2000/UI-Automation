package com.ui.seleniumdesign.demoblazeautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonActionsAcrossPages {


    private WebDriverWait wait;
    public CommonActionsAcrossPages(WebDriver driver){
        this.wait = new WebDriverWait(driver,30);
    }
    public abstract void isDisplayed();

}
