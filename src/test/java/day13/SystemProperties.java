package day13;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SystemProperties {
//    private WebDriver driver;

//    @BeforeMethod
//    public void setup(){
//        driver = BrowserFactory.getDriver("chrome");
//        driver.get("http://practice.cybertekschool.com");
//    }
    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.home"));
    }

//    @AfterMethod
//    public void teardown(){}
//
//    public void setDriver(WebDriver driver) {
//        driver.quit();
//    }
}
