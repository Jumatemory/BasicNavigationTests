package day12;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

public class ActionClassHoverPractice {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");

    }
    @Test
    public void test1(){
        driver.findElement(By.linkText("Hovers")).click();
        Actions action = new Actions(driver);
        WebElement image = driver.findElement(By.cssSelector(".figure:nth-of-type(1)"));
        action.moveToElement(image ).perform();
        Delayer.waitTimeGenerator(4);
        WebElement expected = driver.findElement(By.xpath("//*[contains(text(),'name: user1')]"));
        String actual = "name: user1";
        Assert.assertEquals(expected.getText(),actual);
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected.getText());


    }


    @AfterMethod
    public void teardown(){
        driver.quit();

    }

}
