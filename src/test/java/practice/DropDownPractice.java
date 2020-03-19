package practice;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.Delayer;

import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        setup();
        selectByTextTest();

    }
    public static void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");


    }
    public static void selectByTextTest(){
        Select select = new Select(driver.findElement(By.id("dropdown")));
        Delayer.waitTimeGenerator(4);
        select.selectByVisibleText("Option 1");
        Delayer.waitTimeGenerator(3);
        driver.close();

    }

}
