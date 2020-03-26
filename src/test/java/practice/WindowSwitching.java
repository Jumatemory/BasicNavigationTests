package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

import java.util.Set;

public class WindowSwitching {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void switchWindow(){
        driver.findElement(By.linkText("New tab")).click();
        Delayer.waitTimeGenerator(4);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Practice", "title is wrong");
    }
@Test
public void switchWindow2(){
    driver.findElement(By.linkText("New tab")).click();
    String oldWindow = driver.getWindowHandle();
    Delayer.waitTimeGenerator(4);
    Set<String> windowHandles = driver.getWindowHandles();
    for (String windowHandle:windowHandles){
        if (!windowHandle.equals(oldWindow)){
            driver.switchTo().window(windowHandle);
        }

    }
    System.out.println(driver.getTitle());
    Assert.assertEquals(driver.getTitle(),"Fresh tab", "Title is wrong");


}










    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(4);
        driver.quit();
    }
}
