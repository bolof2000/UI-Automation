package com.ui.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBar extends AbstractComponent{

    private WebDriverWait wait;
    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "news")
    private WebElement news;

    @FindBy(linkText = "shopping")
    private WebElement shopping;

    @FindBy(linkText= "images")
    private WebElement images;

    public NavigationBar(final WebDriver driver){
      PageFactory.initElements(driver,this);
    }
    @Override
    public boolean isDisplayed() {
     return  wait.until((d) -> this.bar.isDisplayed()) ;
    }
}
