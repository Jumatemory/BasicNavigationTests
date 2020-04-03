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

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),LoginPage.class);
    }
    public void login(String usernameInput, String passwordInput){
        username.sendKeys(usernameInput);
       password.sendKeys(passwordInput, Keys.ENTER);
        Delayer.waitTimeGenerator(3);
    }

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER );
        Delayer.waitTimeGenerator(3);
    }
}
