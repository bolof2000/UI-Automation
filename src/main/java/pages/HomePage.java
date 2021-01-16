package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // private By formAuthenticationLink = By.linkText("Form Authentication");
   // private By dropdown = By.linkText("dropdown");

    public void clickLinksInHomepage(String locator) {
        driver.findElement(By.linkText(locator)).click();
    }

    /*
    Each page contains takes a constructors with the driver
     */
    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLinksInHomepage("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink(){
        clickLinksInHomepage("Dropdown");
        return new DropdownPage(driver);
    }
}
