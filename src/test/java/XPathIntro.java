import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Delayer;

import java.security.Key;
import java.security.interfaces.DSAKey;

public class XPathIntro {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ventfitness.com/join-plan/?plan_name=e3_79&location_id=5129");
        driver.manage().window().maximize();
        Delayer.waitTimeGenerator(4);
        WebElement firstName = driver.findElement(By.cssSelector("#fname_input"));
        firstName.sendKeys("Habib");
        Delayer.waitTimeGenerator(1);
        WebElement lastName = driver.findElement(By.cssSelector("#lname_input"));
        lastName.sendKeys("Azizyar");
        Delayer.waitTimeGenerator(1);
        WebElement city = driver.findElement(By.cssSelector("#city_input"));
        city.sendKeys("Albany");
        Delayer.waitTimeGenerator(1);
        WebElement DOB = driver.findElement(By.cssSelector("input[name='birthday']"));
        DOB.sendKeys("01/01/1966");
       WebElement dateOfBirthLabel = driver.findElement(By.xpath("//*[contains(text(),'Date of Birth *')]"));
       dateOfBirthLabel.click();
        Delayer.waitTimeGenerator(1);
        WebElement email = driver.findElement(By.cssSelector("#email_input"));
        email.sendKeys("Habib.Azizyar@gmail.com");
        Delayer.waitTimeGenerator(1);
        WebElement employer = driver.findElement(By.cssSelector("input[name = employer]"));
        employer.sendKeys("Dunkin Donut");
        Delayer.waitTimeGenerator(1);
        WebElement address = driver.findElement(By.cssSelector("#address_input"));
        address.sendKeys("82 West street");
        Delayer.waitTimeGenerator(1);
        WebElement zipCode = driver.findElement(By.cssSelector("input[name=zipCode]"));
        zipCode.sendKeys("12182");
        Delayer.waitTimeGenerator(1);
        WebElement gender = driver.findElement(By.cssSelector("#gender_male"));
        gender.click();
        Delayer.waitTimeGenerator(1);







        Delayer.waitTimeGenerator(3);
        driver.quit();
    }
}
