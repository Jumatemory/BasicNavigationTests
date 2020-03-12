package com.cbt.utilities;

import com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com/", "https:// westelm.com/");
        driver.get(urls.get(0));
        Thread.sleep(3000);
        String firstWebsiteTitle = driver.getTitle().toLowerCase().
                replace(" ","");
        String firstUrl = driver.getCurrentUrl();
        if (firstUrl.contains(firstWebsiteTitle )){
            System.out.println("The first url contains the title");
        } else {
            System.out.println("The url does not contain the title");
        }
        driver.get(urls.get(1));
        Thread.sleep(3000);
        String secondWebsiteTitle = driver.getTitle().toLowerCase().
                replace(" ","");
        String secondUrl = driver.getCurrentUrl();
        if (secondUrl.contains(secondWebsiteTitle )){
            System.out.println("The second url contains the title");
        }
        else {
            System.out.println("The url does not contain the title");
        }
        driver.get(urls.get(2));
        Thread.sleep(3000);
        String thirdWebsiteTitle = driver.getTitle().toLowerCase().
                replace(" ","");
        String thirdUrl = driver.getCurrentUrl();
        if (thirdUrl.contains(thirdWebsiteTitle )){
            System.out.println("The third url contains the title");
        }
        else {
            System.out.println("The url does not contain the title");
        }
















        Thread.sleep(3000);
        driver.quit();

    }
}
