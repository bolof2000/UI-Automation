package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public WebDriver initializeDrivers() throws IOException {

        /*
        define file for variables such as browser type, url
        define which browser to use for execution- implements to include all browser options
        load the data.properties file that contains variables
        set the webdriver path


         */
        FileInputStream fis = new FileInputStream("/Volumes/TECH/Automations/UI-Automation/src/main/java/Academy/data.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String browserType = prop.getProperty("browser");
        String url = prop.getProperty("url");

        if(browserType.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Volumes/TECH/Automations/UI-Automation/src/main/utilities/chromedriver");
            driver = new ChromeDriver();
            //driver.get(url);
        }
        else if (browserType.equals("firefox")){
            //set gecho driver path
            driver = new FirefoxDriver();

        }
        else if(browserType.equals("IE")){
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

}
