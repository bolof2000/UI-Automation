package base;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import sun.jvm.hotspot.debugger.bsd.amd64.BsdAMD64CFrame;

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



