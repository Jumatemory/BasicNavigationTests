package day12;

import com.cbt.utilities.BrowserFactory;
import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;
import utilities.Driver;

public class JSExecutorPractice {
    private WebDriver driver;
   @BeforeMethod
    public  void setup(){
       driver = BrowserFactory.getDriver("chrome");



   }
   @Test
   public void test1(){
       driver.get("http://practice.cybertekschool.com/infinite_scroll");
       JavascriptExecutor js = (JavascriptExecutor)driver;

       for (int i = 0; i <=10; i++) {
           Delayer.waitTimeGenerator(2 );
           js.executeScript("window.scrollBy(0,1000);");
       }



   }
   @Test
   public void test2(){
       driver.get("http://practice.cybertekschool.com/large");
       WebElement link =driver.findElement(By.linkText("Cybertek School"));
       JavascriptExecutor js =(JavascriptExecutor)driver;
       js   .executeScript("arguments[0].scrollIntoView(true)", link);
       Delayer.waitTimeGenerator(2);

   }
   @Test
   public void test3(){
       driver.get("http://practice.cybertekschool.com/dynamic_loading");
       WebElement btn1 = driver.findElement(By.partialLinkText("Example 1"));
       JavascriptExecutor js= (JavascriptExecutor)driver;
       Delayer.waitTimeGenerator(3);
       js.executeScript("arguments[0].click()",btn1);

   }
   @Test
   public void test4(){
       driver.get("http://practice.cybertekschool.com/sign_up");
       driver.manage().window().maximize();
       Delayer.waitTimeGenerator(3);
       WebElement username = driver.findElement(By.name("full_name"));
       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].setAttribute('value','jumatemory')",username);
       Delayer.waitTimeGenerator(3);
       WebElement email = driver.findElement(By.name("email"));

       js.executeScript("arguments[0].setAttribute('value','juma@gmail.com')",email );

Delayer.waitTimeGenerator(3);




       WebElement signUp = driver.findElement(By.name("wooden_spoon"));
       js.executeScript("arguments[0].click()",signUp);
   }




   @AfterMethod
    public void teardown(){
       Delayer.waitTimeGenerator(3);
       driver.quit();
   }

}
