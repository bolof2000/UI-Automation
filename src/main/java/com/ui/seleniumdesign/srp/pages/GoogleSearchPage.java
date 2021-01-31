package com.ui.seleniumdesign.srp.pages;

import com.ui.seleniumdesign.srp.components.SearchSuggestion;
import com.ui.seleniumdesign.srp.components.SearchWidget;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    /*
    create webdriver object for the class
    Initialize the components required to test this page
    create getters to return each components

     */
    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleSearchPage(final WebDriver driver) {
        this.driver = driver;
        this.searchSuggestion = new SearchSuggestion(driver);
        this.searchWidget = new SearchWidget(driver);
    }


    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }
}
