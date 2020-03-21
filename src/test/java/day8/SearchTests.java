package day8;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utilities.Delayer;

import java.util.List;

public class SearchTests {
    private WebDriver driver;

   @Test
    public void googleSearchTest(){
       driver.get("http://google.com");
       driver.manage().window().maximize();
       driver.findElement(By.cssSelector("input[name=q]")).sendKeys("java", Keys.ENTER);
       List<WebElement> allJavaLinks = driver.findElements(By.tagName("h3"));
       for (WebElement searchItem: allJavaLinks){
          String var = searchItem.getText().toLowerCase();
          if (!var.isEmpty()&& var.startsWith("java")){
              System.out.println(var);
          }
       }

    }


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79.0").setup();
         driver = new ChromeDriver();

    }
    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(4);
        driver.quit();
    }

}

