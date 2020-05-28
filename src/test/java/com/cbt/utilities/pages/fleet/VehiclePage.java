package com.cbt.utilities.pages.fleet;

import com.cbt.utilities.pages.AbstractPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclePage extends AbstractPageBase   {
    @FindBy
    private WebElement createCar;
    public void clickToCreateCar(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();
    }
}
