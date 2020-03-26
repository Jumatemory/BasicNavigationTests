package day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class DriverTest {
    @Test
    public void googleTest(){
        Driver.getDriver().get("http://google.com");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Google");
        Driver.closeDriver();
    }

}
