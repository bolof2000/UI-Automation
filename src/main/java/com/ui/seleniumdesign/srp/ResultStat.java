package com.ui.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultStat extends AbstractComponent {

    private WebDriverWait wait;
    @FindBy(id = "resultStats")
    private WebElement stat;

    public ResultStat(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @Override
    public boolean isDisplayed() {
        return  wait.until((d) -> this.stat.isDisplayed()) ;
    }
}
