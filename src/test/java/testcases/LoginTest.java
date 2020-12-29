package testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import testbase.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void loginToWebsite() throws InterruptedException {
       driver.findElement(By.linkText("login")).click();
       Thread.sleep(3000);
    }
}
