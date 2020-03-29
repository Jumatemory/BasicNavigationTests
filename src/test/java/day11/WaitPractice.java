package day11;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitPractice {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        Delayer.waitTimeGenerator(5);

    }

    @Test
    public void test(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Dynamic Loading")).click();
        Delayer.waitTimeGenerator(3);
        driver.findElement(By.partialLinkText("Example 2")).click();
        //*[contains(text(),'Start')]
        driver.findElement(By.xpath("//*[contains(text(),'Start')]")).click();

        WebElement finishElement = driver.findElement(By.id("finish"));

        String actual ="Hello World!";
        Assert.assertEquals(actual,finishElement.getText());


    }
    @Test
    public void test2(){
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 1")).click();
       driver.findElement(By.xpath("//*[contains(text(),'Start')]")).click();



        WebElement username = driver.findElement(By.id("username"));

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("tomsmith");
       WebElement password =driver.findElement(By.id("pwd"));
       wait.until(ExpectedConditions.visibilityOf(password));
       password.sendKeys("SuperSecretPassword");

        driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
        Delayer.waitTimeGenerator(10);

        WebElement message = driver.findElement(By.tagName("h4"));
        wait.until(ExpectedConditions.visibilityOf(message));

        String expectedMessage= "Welcome to the Secure Area. When you are done click logout below.";
        Assert.assertEquals(expectedMessage,message.getText());
        Delayer.waitTimeGenerator(5);


    }
    @Test
    public void test3(){
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 5")).click();
        Delayer.waitTimeGenerator(5);

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement overlayElement = driver.findElement(By.cssSelector("[class='fa fa-cog fa-spin']"));
        wait.until(ExpectedConditions.invisibilityOf(overlayElement));
        WebElement username = driver.findElement(By.id("username"));
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("pwd"));
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("SuperSecretPassword");
        WebElement submitButton = driver.findElement(By.xpath("//*[contains(text(),'Submit')]"));
        wait.until(ExpectedConditions.visibilityOf(submitButton)).click();
//        WebElement username = driver.findElement(By.id("username"));
//        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("tomsmith");
//        WebElement password = driver.findElement(By.id("pwd"));
//        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("SuperSecretPassword");

        String actual = driver.findElement(By.tagName("h4")).getText();
        String expected="Welcome to the Secure Area. When you are done click logout below.";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test5(){
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.partialLinkText("Example 2")).click();
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(ElementNotVisibleException.class);
        WebElement message = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver ) {
                return  driver.findElement(By.id("finish"));
            }
        });
    }



    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
