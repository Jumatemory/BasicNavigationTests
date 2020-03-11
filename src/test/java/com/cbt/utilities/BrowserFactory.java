package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browserType) {
        String oSType = getOperatingSystem();

        if (oSType.startsWith("Windows")&&browserType.equalsIgnoreCase("Safari")) {
            System.out.println("test result is good ");
            return null;
        } else if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("fireFox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();

        } else if (browserType.equalsIgnoreCase("safariDriver")) {
            return new SafariDriver();
        } else {
            return null;
        }


    }
    public  static String getOperatingSystem(){
        String os = System.getProperty("os.name");
        return os;
    }
}
