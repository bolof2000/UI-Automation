package com.ui.seleniumdesign.srp;

import org.apache.http.NameValuePair;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;
    private NavigationBar navigationBar;
    private ResultStat resultStat;

    public GoogleResultPage(final WebDriver driver){
        this.searchWidget = PageFactory.initElements(driver,SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver,SearchSuggestion.class);
        this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        this.resultStat = PageFactory.initElements(driver,ResultStat.class);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public ResultStat getResultStat() {
        return resultStat;
    }
}
