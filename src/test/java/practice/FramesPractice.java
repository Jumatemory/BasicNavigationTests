package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

public class FramesPractice {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/frames");
    }
    @Test(description =  "The purpose of this test method is demonstrate " +
            "the frames purpose ")
    public void test1(){
        driver.findElement(By.linkText("iFrame")).click();
        driver.switchTo().frame("mce_0_ifr");
        WebElement inputArea = driver.findElement(By.id("tinymce"));
        String expected = "Your content goes here.";
        String actualText = inputArea.getText();
        Assert.assertEquals(expected,actualText);
        Delayer.waitTimeGenerator(3);
        inputArea.clear();
        inputArea.sendKeys("java is fun");
        Delayer.waitTimeGenerator(3);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href='https://cybertekschool.com/']")).click();


    }
    @Test (description = "Nested Frames Example ")
    public void test2(){

        WebElement firstFrame = driver.findElement(By.linkText("Nested Frames"));
        firstFrame.click();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        WebElement contentText = driver.findElement(By.tagName("body"));

        System.out.println(contentText.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.tagName("body")).getText());



    }
    @Test
    public void test3(){
        driver.get("https://www.readersdigest.ca/travel/world/top-10-most-luxurious-hotels-world/");
        Delayer.waitTimeGenerator(3);
        driver.switchTo().frame("https://www.readersdigest.ca/travel/world/top-10-most-luxurious-hotels-world/").close();
         

    }


    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(4);
        driver.quit();
    }

}



