package com.ui.seleniumdesign.demoblazeautomation;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver ;
     private SignUpComponent signUpComponent;
     private LoginComponent loginComponent;
     private ContactComponent contactComponent;

     public HomePage(WebDriver driver){
         this.driver = driver;
         signUpComponent = new SignUpComponent(driver);
         contactComponent = new ContactComponent(driver);

     }

     public void goToURL(){
         driver.get("https://www.demoblaze.com/index.html#");
     }

    public SignUpComponent getSignUpComponent() {
        return signUpComponent;
    }

    public void setSignUpComponent(SignUpComponent signUpComponent) {
        this.signUpComponent = signUpComponent;
    }

    public ContactComponent getContactComponent() {
        return contactComponent;
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }
}
