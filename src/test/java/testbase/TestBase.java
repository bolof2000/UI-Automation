package testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.PropertyPermission;

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
        Open property files
        excel readers
         */
        if(driver == null){
            fis = new FileInputStream("/Volumes/TECH/Automations/UI-Automation/src/test/java/configs/config.properties");
            config.load(fis);
        }


    }

    @AfterSuite
    public void tearDown(){


    }
}
