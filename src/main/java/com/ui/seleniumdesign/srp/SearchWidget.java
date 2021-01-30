package com.ui.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchWidget extends AbstractComponent{

    /*
    Find elements for the components
    create field object for the element
    Create class constructor to initialize driver, wait
    create a method to interact with element


     */
    private WebDriverWait wait;
    @FindBy(name = "q")
    private WebElement searchBox;

    public SearchWidget(final WebDriver driver){
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);

    }
    public void enterWordToSearch(String keyWord){
        this.searchBox.clear();
        this.searchBox.sendKeys(keyWord);
    }

    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchBox));
        return this.searchBox.isDisplayed();
    }
}
