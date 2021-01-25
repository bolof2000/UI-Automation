package steps;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    /*
    this class contains driver initialization
    methods implementation for common functions
     */
    private WebDriver driver;
    protected HomePage homepage;

        @BeforeClass
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "/Volumes/TECH/Automations/UI-Automation/src/main/utilities/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");
            homepage = new HomePage(driver);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }



