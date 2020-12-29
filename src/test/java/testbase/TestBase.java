package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.PropertyPermission;
import java.util.concurrent.TimeUnit;

public class TestBase {

    /*
    webDriver
    Properties
    Extent Reports
    Logs
    Mail
    Excel


     */

    public static WebDriver driver;
    public static  FileInputStream fis;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();



    @BeforeSuite
    public void setUp() throws IOException {
        /*
        Webdriver Initialization
        select browser to run test
        initialize properties file for Object locators
        Open property files
        excel readers
         */
        if(driver == null){
            fis = new FileInputStream("/Volumes/TECH/Automations/UI-Automation/src/test/java/configs/config.properties");
            config.load(fis);

            fis = new FileInputStream(System.getProperty("/Volumes/TECH/Automations/UI-Automation/src/test/java/objectlocators/login.properties"));
            OR.load(fis);
        }
        if(config.getProperty("browser").equals("chrome")){

            System.setProperty("webdriver.chrome.driver",System.getProperty("/Volumes/TECH/Automations/UI-Automation/src/test/chromedriver"));
            driver = new ChromeDriver();
        }
        if(config.getProperty("browser").equals("firefox")){

            System.setProperty("webdriver.firefox.driver",System.getProperty("/Volumes/TECH/Automations/UI-Automation/src/test/firefoxdriver"));

            driver = new FirefoxDriver();
        }
        driver.get(config.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterSuite
    public void tearDown(){
        if(driver != null){
        driver.quit();


    }
}}
