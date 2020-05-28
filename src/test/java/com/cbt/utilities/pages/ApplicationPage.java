package com.cbt.utilities.pages;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ApplicationPage {

    @FindBy(id = "search")
    private WebElement searchInput;
    @FindBy(css = "input[name='location']")
    private WebElement locationInput;
    @FindBy(css = "button[class='button button--yellow']")
    private WebElement searchButton;
    @FindBy(linkText = "Cashier / Front End Associate")
    private WebElement cashierLink;



    public ApplicationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void setSearchInput(String search){
        searchInput.sendKeys(search);
    }
    public void setLocationInput(String location){
        locationInput.clear();
        locationInput.sendKeys(location);
    }
    public void clickSearchButton   (){
        searchButton.click();
    }
    public void clickOnJobLink(){
        cashierLink.click();
    }
}
