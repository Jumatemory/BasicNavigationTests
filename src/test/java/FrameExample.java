import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

public class FrameExample {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");


    }

//    @Test
//    public void testFrame(){
//
//        driver.manage().window().maximize();
//        Delayer.waitTimeGenerator(4);
//       int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println(size);
//
//    }
//    @Test
//    public void test3(){
//        Actions builder = new Actions(driver);
//        WebElement image1 = driver.findElement(By.cssSelector(".figure:nth-of-type(1)"));
//       builder.moveToElement(image1).perform();
//       Delayer.waitTimeGenerator(4);
//       WebElement textOfImage = driver.findElement(By.xpath("//*[contains(text(),'name: user1')]"));
//       String expected ="name: user1";
//        Assert.assertEquals(expected,textOfImage.getText());
//
//
//
//
//    }
    @Test
    public void Test5(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        Delayer.waitTimeGenerator(4);
        driver.findElement(By.xpath("//*[contains(text(),'Accept Cookies')]")).click();
        Delayer.waitTimeGenerator(5);
        Actions action = new Actions(driver);
        WebElement draggable = driver.findElement(By.id("draggable"));
        Delayer.waitTimeGenerator(3);
        WebElement dropTarget = draggable.findElement(By.id("droptarget"));
        Delayer.waitTimeGenerator(3);
        action.dragAndDrop(draggable,dropTarget ).perform();
    }



@AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(2);

    }
}
