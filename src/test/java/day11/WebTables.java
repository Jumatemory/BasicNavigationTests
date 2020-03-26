package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Delayer;

import java.util.Arrays;
import java.util.List;

public class WebTables {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79.").setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);


        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().window().maximize();
        Delayer.waitTimeGenerator(3);
    }


    @Test
    public void getColumnNames(){
        List<String> expected = Arrays.asList("Last Name","First Name", "Email", "Due", "Web Site", "Action");
        List<WebElement> columnNames = driver.findElements(By.xpath("//table[1]//th"));
        for (WebElement columnName: columnNames){
            System.out.println(columnName.getText());
        }
        Assert.assertEquals(Delayer.getTextFromWebElements(columnNames),expected);
    }
    @Test
    public void verifyRowCount (){
        List<WebElement> rows = driver.findElements(By.xpath("//table[1]//tbody//tr"));
        Assert.assertEquals(rows.size(),4);
    }
    @Test
    public void getSpecificColumn(){
        List<WebElement> links = driver.findElements(By.xpath("//table[1]//tbody//tr//td[5]"));
        System.out.println(Delayer.getTextFromWebElements(links));


    }
    @Test
    public void deleteRowTest(){
        String xPath ="//table[1]//td[text()='jsmith@gmail.com']/..//a[text()='delete']";
        driver.findElement(By.xpath(xPath)).click();

        int rowCount = driver.findElements(By.xpath("//table[1]//tbody//tr")).size();
        Assert.assertEquals(rowCount,3);
        List<WebElement> emails = driver.findElements(By.xpath("//table[1]//td[text()= 'jsmith@gmail.com']"));
        Assert.assertTrue(emails.isEmpty());

    }


    @AfterMethod
    public void teardown(){
        Delayer.waitTimeGenerator(3);
        driver.quit();
    }
    @Test
    public void getColumnNameIndexByName(){
        String columnName = "Email";
        List<WebElement > columnNames = driver.findElements(By.xpath("//table[2]//th"));
        int index = 0;
        for (int i = 0; i <columnNames.size() ; i++) {
            if (columnNames.get(i).getText().equals(columnName)){
                index =i+1;
                break;

            }

        }
        Assert.assertEquals(index,3);
    }
    @Test
    public void getSpecificCell(){
        String expected = "http://www.jdoe.com";
        int row =3;
        int column=5;
        String xPath = "//table[1]//tbody//tr["+ row + "]//td[" +column+"]" ;

        WebElement cell = driver.findElement((By.xpath(xPath)));
        Assert.assertEquals(cell.getText(),expected);
    }




}
