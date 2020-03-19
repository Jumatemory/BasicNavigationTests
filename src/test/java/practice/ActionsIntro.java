package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Delayer;


import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ActionsIntro {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.edureka.co/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Delayer.waitTimeGenerator(3);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
        Delayer.waitTimeGenerator(3);
        WebElement softTestLink = driver.findElement(By.id("software-testing-certification-courses"));
        builder.moveToElement(softTestLink).build().perform();
        Delayer.waitTimeGenerator(2);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
        Delayer.waitTimeGenerator(3);
        WebElement searchBox = driver.findElement(By.id("#search-inp-overlay-new"));
        builder.moveToElement(searchBox).build().perform();
        Delayer.waitTimeGenerator(2);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"remote\"]/span[2]"));
        builder.moveToElement(searchBox).build().perform();
        Delayer.waitTimeGenerator(2);
        Action seriesOfActions ;



















        Delayer.waitTimeGenerator(3);
        driver.quit();

    }
}
