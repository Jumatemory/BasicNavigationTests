package com.cbt.utilities.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class ApplicationPage {
    WebDriverWait wait;

    @FindBy(id = "search")
    private WebElement searchInput;
    @FindBy(css = "input[name='location']")
    private WebElement locationInput;
    @FindBy(css = "button[class='button button--yellow']")
    private WebElement searchButton;
    @FindBy(linkText = "Cashier / Front End Associate")
    private WebElement cashierLink;
    @FindBy(linkText = "Apply")
    private WebElement applyLink;
    @FindBy(id = "#mat-checkbox-2-input")
    private WebElement agreeCheckBox;
    @FindBy(id = "menuButton")
    private WebElement continueButton;



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
    public void clickApplyLInk(){
        applyLink.click();
    }
    public void clickOnAgreeCheckBox(){
        wait.until(ExpectedConditions.elementToBeClickable(agreeCheckBox)).click();

    }
    public void clickOnContinueButton(){
        continueButton.click();
    }
}
