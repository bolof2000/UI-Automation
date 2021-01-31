package com.ui.seleniumdesign.test;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pages.HomePage;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    /*
    this class contains driver initialization
    methods implementation for common functions
     */
    protected static WebDriver driver;

    public static void goToUrl(String s){
        driver.get("https://www.google.com");
    }

    @BeforeTest
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "/Volumes/TECH/Automations/UI-Automation/src/main/utilities/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @DataProvider
    public static Object[][] getData(){

        return new Object[][]{
                {"bolof",3},
                {"selenium",4}
        };
    }

        @After
        public void tearDown() throws InterruptedException {
            driver.quit();
            Thread.sleep(1000);

        }


    }



