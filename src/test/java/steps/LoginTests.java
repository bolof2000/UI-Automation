package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests  {
    public WebDriver driver;
    public By formAuth = By.linkText("Form Authentication");
    public By usernameField = By.id("username");
    public  By passwordField = By.id("password");
    public  By loginButton = By.cssSelector("#login button");
    public By securePageVerifcation = By.id("flash");
    @Given("a valid Url")
    public void aValidUrl() {

        System.setProperty("webdriver.chrome.driver", "/Volumes/TECH/Automations/UI-Automation/src/main/utilities/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("I click on the form authentication url")
    public void iClickOnTheFormAuthenticationUrl() {
        driver.findElement(formAuth).click();

    }

    @And("I enter username and password")
    public void iEnterUsernameAndPassword(DataTable loginData) {
        driver.findElement(usernameField).sendKeys(loginData.cell(1,0));
        driver.findElement(passwordField).sendKeys(loginData.cell(1,1));
        driver.findElement(loginButton).click();

    }

    @Then("the verify successful login")
    public void theVerifySuccessfulLogin() {
        String verifyLogin= driver.findElement(securePageVerifcation).getText();
        Assert.assertFalse(verifyLogin.contains("You logged into a secure area!"));

        driver.quit();
    }
}
