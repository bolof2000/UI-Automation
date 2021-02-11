package com.ui.seleniumdesign.demoblazeautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactComponent extends CommonActionsAcrossPages{
    private WebDriver driver;

    @FindBy(linkText = "Contact")
    private WebElement contact;

    @FindBy(id="recipient-email")
    private WebElement contactEmail;
    @FindBy(id="recipient-name")
    private WebElement contactName;
    @FindBy(id="message-text")
    private WebElement messageContent;
    @FindBy(xpath = ".//button[text()=Send Message]")
    private WebElement sendMessageButton;
    @FindBy(xpath = ".//button[text()=Close]")
    private WebElement close;

    public ContactComponent(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @Override
    public void isDisplayed() {

    }

    public void clickContactForm() {

     this.contact.click();

    }

    public void sendContactInformation(String email,String name,String message){
        this.contactEmail.sendKeys(email);
        this.contactName.sendKeys(name);
        this.messageContent.sendKeys(message);
        this.sendMessageButton.click();
    }

    public void CloseContactInformation(String email,String name,String message){
        this.contactEmail.sendKeys(email);
        this.contactName.sendKeys(name);
        this.messageContent.sendKeys(message);
        this.close.click();
    }
}
