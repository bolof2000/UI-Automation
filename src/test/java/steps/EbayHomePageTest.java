package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHomePageTest {
    @Given("I am on Ebay Home Page")
    public void iAmOnEbayHomePage() {

        System.out.println("Home Page");
    }

    @When("I click on advanced Link")
    public void iClickOnAdvancedLink() {

        System.out.println("Click on link");
    }

    @Then("I navigate to advanced search page")
    public void iNavigateToAdvancedSearchPage() {

        System.out.println("Verify landed on Page ");
    }
}
