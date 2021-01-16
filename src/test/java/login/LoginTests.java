package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginpage= homepage.clickFormAuthentication();
        loginpage.setUsernameField("tomsmith");
        loginpage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureareapage=  loginpage.clickLoginButton();
        String verifyLogin = secureareapage.getAlertText();
        assertTrue(verifyLogin.contains("You logged into a secure area!"),"Alert text is Incorrect");

    }
}
