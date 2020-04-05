package com.cbt.utilities.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Delayer;
import utilities.Driver;

public class LoginPage {
    @FindBy(id = "prependedInput")
            public WebElement username;
    @FindBy(id = "prependedInput2")
            public WebElement password;
    @FindBy(id = "_submit")
            public WebElement login;
    @FindBy(id = "Forgot your password?")
    private WebElement forgotPassword;
    @FindBy(xpath = "//*[contains(text(),'Invalid user name or password.')]")
    private WebElement warningMessage;

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void login(String usernameInput, String passwordInput){
        username.sendKeys(usernameInput);
       password.sendKeys(passwordInput, Keys.ENTER);
        Delayer.waitTimeGenerator(3);
    }

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER );
        Delayer.waitForPageToLoad(10);
        Delayer.waitTimeGenerator(5);
    }
    public String getWarningMessageText(){
        return warningMessage.getText();
    }
}
