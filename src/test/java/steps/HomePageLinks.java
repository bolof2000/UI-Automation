package steps;

import com.ui.seleniumdesign.test.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageLinks extends BaseTest {
    public WebDriver driver;
    public HomePageLinks(WebDriver driver){
        this.driver = driver;
    }
    @Given("That i navigate to the given valid URL")
    public void thatINavigateToTheGivenValidURL() {

    }

    @When("I click on {string}")
    public void iClickOnLink(String links) {
        driver.findElement(By.id("")).click();
    }

    @Then("I validate that the page navigates to {string} and the title contains {string}")
    public void iValidateThatThePageNavigatesToUrlAndTheTitleContainsTitle(String url,String title)
    {
    }
}
