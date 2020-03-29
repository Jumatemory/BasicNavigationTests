package day12;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

public class DragAndDroPractice {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        Delayer.waitTimeGenerator(3);




    }
    @Test
    public void practiceDragAndDrop(){
        driver.findElement(By.xpath("//*[contains(text(),'Accept Cookies')]")).click();

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droptarget"));

        Actions action = new Actions(driver);
        action.dragAndDrop(source,destination).build().perform();

    }

    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(20);

    }
}
