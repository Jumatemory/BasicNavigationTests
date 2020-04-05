package com.cbt.utilities.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Delayer;
import utilities.Driver;


public  class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,15);
    @FindBy(css = "#User-menu > a")
    protected WebElement currentUser;
    public AbstractPageBase(){

        PageFactory.initElements(driver,this);
    }



    public String getCurrentUserName(){
        wait.until(ExpectedConditions.visibilityOf(currentUser));
        return currentUser.getText().trim();
    }
    public void navigateTo(String tabName,String moduleNme  ){
        String tabNameXpath = "//span[@class='title title-level-1' and contains(text(),'"+tabName+"')] ";
        String moduleXpath = "//span[@class='title title-level-2' and contains(text(),'"+moduleNme+"')] ";
        WebElement tabElement = driver.findElement(By.xpath(tabNameXpath));
        WebElement moduleElement = driver.findElement(By.xpath(moduleXpath));
        Actions actions = new Actions(driver);
        actions.moveToElement(tabElement).pause(2000).click(moduleElement).build().perform();
        Delayer.waitTimeGenerator(4);
    }

}
