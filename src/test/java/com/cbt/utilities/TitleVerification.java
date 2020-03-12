package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");
         driver.get(urls.get(0));
        Thread.sleep(3000);
       String firstWebsiteTitle = driver.getTitle();

               driver.get(urls.get(1));
               Thread.sleep(3000);
        String secondWebsiteTitle = driver.getTitle();
        System.out.println("title : "+secondWebsiteTitle);
        driver.get(urls.get(2));
        String thirdWebsiteTitle = driver.getTitle();
        System.out.println("title : "+thirdWebsiteTitle);
        //below code checks if three urls from 3 pages are the same or not
       System.out.println(firstWebsiteTitle.equalsIgnoreCase(secondWebsiteTitle)&&
               secondWebsiteTitle.equalsIgnoreCase(thirdWebsiteTitle));

        for (int i = 0; i < urls.size(); i++) {
            if (urls.get(i).startsWith("http")){
                System.out.println("url : "+ urls.get(i) + " start with http");
            } else {
                System.out.println("The url does not start with http");
            }
        }





        Thread.sleep(4000);
        driver.quit();
    }
}
