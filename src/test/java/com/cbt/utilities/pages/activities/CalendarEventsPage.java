package com.cbt.utilities.pages.activities;

import com.cbt.utilities.pages.AbstractPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Delayer;

import java.util.List;

public class CalendarEventsPage extends AbstractPageBase {
    @FindBy(css = "[title='Create Calendar event']")
    private WebElement createCalendarEvent;
    @FindBy(className = "select2-chosen")
    private WebElement owner;
    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_start']")
    private WebElement startDate;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_start']")
    private WebElement startTime;
    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    private WebElement endTime;
    @FindBy(className = "grid-header-cell__label")
    private List<WebElement> columnsNames;

    public  List<String> getColumnNames(){
        Delayer.waitForPageToLoad(20);

        return Delayer.getTextFromWebElements(columnsNames);
    }


    public String getStartTime(){
        Delayer.waitForPageToLoad(20);
        wait.until(ExpectedConditions.visibilityOf(startDate));
        return startTime.getAttribute("value");
    }
    public String getEndTime(){
        Delayer.waitForPageToLoad(20);
        return endTime.getAttribute("value");
    }




    public String getOwnerName(){
        Delayer.waitForPageToLoad(15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-chosen")));
        wait.until(ExpectedConditions.visibilityOf(owner));
        return owner.getText().trim();
    }
    public void clickToCreateCalendarEvent(){
       Delayer.waitForPageToLoad(15);

       wait.until(ExpectedConditions.elementToBeClickable(createCalendarEvent)).click();

    }
    public String getStartDate(){
        Delayer.waitForPageToLoad(15);
        Delayer.waitForPageToLoad(15);
        wait.until(ExpectedConditions.visibilityOf(startDate));
        return startDate.getAttribute("value");
    }

}
