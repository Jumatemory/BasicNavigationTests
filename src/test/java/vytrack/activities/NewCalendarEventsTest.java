package vytrack.activities;

import com.cbt.utilities.pages.LoginPage;
import com.cbt.utilities.pages.activities.CalendarEventsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DateTimeUtilities;
import vytrack.AbstractTestBase;

import java.util.Arrays;
import java.util.List;

public class NewCalendarEventsTest extends AbstractTestBase {

    @Test

    public void defaultOptionTest(){
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        loginPage.login();
        calendarEventsPage.navigateTo("Activities","Calendar Events");
        calendarEventsPage.clickToCreateCalendarEvent();
        Assert.assertEquals(calendarEventsPage.getOwnerName(),calendarEventsPage.getCurrentUserName());
        Assert.assertEquals(calendarEventsPage.getStartDate(), DateTimeUtilities.getCurrentDate("MMM dd, yyyy "));

    }
    @Test
    public void timeDifferenceTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.navigateTo("Activities","Calendar Events");
        String startTime = calendarEventsPage.getStartTime();
        String endTime = calendarEventsPage.getEndTime();
        String format = "h:m a";
        long actual = DateTimeUtilities.getTimeDifference(startTime,endTime,format);
        calendarEventsPage.clickToCreateCalendarEvent();
      Assert.assertEquals(actual,1,"Time difference is not correct");

    }
    @Test

    public void verifyColumnNamesTest(){
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        calendarEventsPage.navigateTo("Activities","Calendar Events");
        List<String> expected = Arrays.asList("TITLE","CALENDAR","END", "RECURRENT","RECURRENCE","INVITATION STATUS");
        Assert.assertEquals(calendarEventsPage.getColumnNames(),expected);
    }




}
