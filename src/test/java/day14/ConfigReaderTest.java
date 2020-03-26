package day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class ConfigReaderTest {

    @Test
    public void test1(){
        String expectedBrowser = "firefox";
        String actualBrowser = ConfigurationReader.getProperty("browser");
        Assert.assertEquals(expectedBrowser,actualBrowser);
        System.out.println("actualBrowser = " + actualBrowser);
        System.out.println("expectedBrowser = " + expectedBrowser);
        System.out.println(ConfigurationReader.getProperty("url"));
        System.out.println(ConfigurationReader.getProperty("user_name"));
        System.out.println(ConfigurationReader.getProperty("password "));
    }
}
