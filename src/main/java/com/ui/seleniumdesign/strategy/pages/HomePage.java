package com.ui.seleniumdesign.strategy.pages;

import com.ui.seleniumdesign.strategy.component.CreateAaccountComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private CreateAaccountComponent createAaccountComponent;

    public HomePage(final WebDriver driver){
        this.driver = driver;
        this.createAaccountComponent = new CreateAaccountComponent(driver);
    }

    public CreateAaccountComponent getCreateAaccountComponent() {
        return createAaccountComponent;
    }
}
