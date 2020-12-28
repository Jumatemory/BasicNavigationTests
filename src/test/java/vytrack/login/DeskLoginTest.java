package vytrack.login;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.pages.DeskLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
;import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class DeskLoginTest  {
    DeskLoginPage deskLoginPage = new DeskLoginPage();



    @Test
    public void testLogin() throws InterruptedException {
        deskLoginPage.login("jgul",")Case@255");
        deskLoginPage.clickOnLoginButton();
        deskLoginPage.clickONBrisTicket();
        deskLoginPage.createNewTicket();



        deskLoginPage.clickOnDeptDrop();

        deskLoginPage.selectDep("Aging");
        deskLoginPage.setOpenByName("juma");
        deskLoginPage.setEndUserInput("Spencer Lane");
        deskLoginPage.setPhoneInput("2654");
        deskLoginPage.setSummaryInput("WAV files cannot be played on the user laptop");
        deskLoginPage.setDescriptionInput("codec needs to be installed on the laptop so that WAV files can be played " +
                " and also the USB port needs to be unlocked");
        Thread.sleep(5000);
        deskLoginPage.cancel();






    }
    @Test
    public void testEndUserField() throws InterruptedException {
        deskLoginPage.login("jgul",")Case@255");
        deskLoginPage.clickOnLoginButton();
        deskLoginPage.clickONBrisTicket();
        deskLoginPage.createNewTicket();
        deskLoginPage.setEndUserInput("Spencer Lane");

    }
    @Test
    public static void  execution() throws InterruptedException, AWTException {
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url
        Robot robot = new Robot();
        robot.mouseMove(630, 420); // move mouse point to specific location
        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click
        robot.delay(1500);
        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select Save radio button
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        // press enter key of keyboard to perform above selected action
    }
    @Test public void test() throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        System.out.println(driver.getTitle()    );
        driver.switchTo().newWindow(WindowType.TAB);
//Use robot class to press Ctrl+t keys
        //Use robot class to press Ctrl+t keys
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_T);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_T);

//Switch focus to new tab
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
//Launch URL in the new tab
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("As we know that Robot class in Selenium is used for simulating keyboard and mouse events. So, in order to open a new tab, we can simulate the keyboard event of pressing Control Key followed by ‘t’ key of the keyboard. After the new tab gets opened, we need to switch focus to it otherwise the driver will try to perform the operation on the parent tab only.\n" +
                "For switching focus, we will be using getWindowHandles() to get the handle of the new tab and then switch focus to it.", Keys.ENTER);
        Thread.sleep(3000);
        driver.quit();

    }
}




