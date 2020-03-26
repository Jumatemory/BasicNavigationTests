package practice;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

public class FileUploading {
    private WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();
    }
    @Test
    public void uploadFile(){
        driver.findElement(By.linkText("File Upload")).click();
        Delayer.waitTimeGenerator(2);
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Temory Gul\\Desktop\\test2.txt");
        Delayer.waitTimeGenerator(3);

        driver.findElement(By.id("file-submit")).click();
    }

    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(5);
        driver.quit();
    }
}
