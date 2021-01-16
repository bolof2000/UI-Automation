package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public Select dropdownElements(){

        return new Select(driver.findElement(dropdown));
    }

    public void selectElementFromDropdown(String optionToSelect){
        dropdownElements().selectByVisibleText(optionToSelect);
    }

    public List<String> allElementsInDropdown(){
        List<WebElement> allOptions = dropdownElements().getAllSelectedOptions();
        //System.out.println(allOptions);
        return allOptions.stream().map(WebElement::getText).collect(Collectors.toList());

    }
}
