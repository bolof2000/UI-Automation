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
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class EbayHomePageTest {
    WebDriver driver;
    @Given("I am on Ebay Home Page")
    public void iAmOnEbayHomePage() {

        System.setProperty("webdriver.chrome.driver", "/Volumes/TECH/Automations/UI-Automation/src/main/utilities/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }

    @When("I click on advanced Link")
    public void iClickOnAdvancedLink() {

        driver.findElement(By.linkText("Form Authentication")).click();


    }

    @And("I enter {string} and {string}")
    public void iEnterUsernameAndPassword(String username,String password) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector("#login button")).click();
    }


    @Then("I navigate to advanced search page")
    public void iNavigateToAdvancedSearchPage() {
        String verifyLogin= driver.findElement(By.id("flash")).getText();
        Assert.assertFalse(verifyLogin.contains("failed this test please"));

        driver.quit();

    }



}
