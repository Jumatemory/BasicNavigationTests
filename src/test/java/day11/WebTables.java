package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

import java.util.Arrays;
import java.util.List;

public class WebTables {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79.").setup();
        driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().window().maximize();
        Delayer.waitTimeGenerator(3);
    }


    @Test
    public void getColumnNames(){
        List<String> expected = Arrays.asList("Last Name","First Name", "Email", "Due", "Web Site", "Action");
        List<WebElement> columnNames = driver.findElements(By.xpath("//table[1]//th"));
        for (WebElement columnName: columnNames){
            System.out.println(columnName.getText());
        }
        Assert.assertEquals(Delayer.getTextFromWebElements(columnNames),expected);
    }
    @Test
    public void verifyRowCount (){
        List<WebElement> rows = driver.findElements(By.xpath("//table[1]//tbody//tr"));
        Assert.assertEquals(rows.size(),4);
    }

    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(3);
        driver.quit();
    }


}
