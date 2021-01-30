package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
   private final By usernameField = By.id("username");
   private final By passwordField = By.id("password");
   private final By loginButton = By.cssSelector("#login button");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsernameField(String username){
        driver.findElement(usernameField).sendKeys(username);

    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);

    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
