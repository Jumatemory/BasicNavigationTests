package day13;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;

public class ConfigurationReaderTest {
    @Test
    public void readProperties(){
        String browser = ConfigurationReader.getProperty("username");

        System.out.println(browser);
        System.out.println(ConfigurationReader.getProperty("password"));
        System.out.println(ConfigurationReader.getProperty("url"));
        

    }

}
