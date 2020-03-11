package cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        Thread.sleep(2000);
        String googleFirst = driver.getTitle();
        driver.get("https://etsy.com");
        Thread.sleep(2000);
        String etsyTitleFirst = driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        String googleSecond = driver.getTitle();
        StringUtility.verifyEquals(googleFirst,googleSecond);
        driver.navigate().forward();
        String etsyTitleSecond = driver.getTitle();
        StringUtility.verifyEquals(etsyTitleFirst,etsyTitleSecond);


        driver.quit();
    }


}
