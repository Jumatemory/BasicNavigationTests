package day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class DriverTest  {
    @Test
    public void googleTest(){

        Driver.getDriver().get("http://practice.cybertekschool.com");
        Assert.assertEquals(Driver.getDriver().getTitle().toLowerCase(),"practice");
    }

}
