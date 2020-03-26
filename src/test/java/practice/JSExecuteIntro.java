package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

public class JSExecuteIntro {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get(" http://demo.guru99.com/V4/");
        Delayer.waitTimeGenerator(3);

    }
    @Test
    public void ExecuteTest(){
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");
        WebElement loginButton = driver.findElement(By.name("btnLogin"));

        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginButton);

    }


    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(4);
        driver.quit();
    }
}
