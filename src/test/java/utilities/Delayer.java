package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Delayer {

    public static void waitTimeGenerator(int second){

        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static List<String> getTextFromWebElements(List<WebElement> elements){
        List<String> textValues = new ArrayList<String>();
        for (WebElement element: elements){
            if (!element.getText().isEmpty()){
                textValues.add(element.getText());
            }
            textValues.add(element.getText());

        }
        return textValues;
    }
    public static void waitForPageToLoad(long timeoutInSeconds){
        ExpectedCondition<Boolean> expectation = driver ->((JavascriptExecutor)driver).
                executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeoutInSeconds);


        }catch (Throwable error){
            error.printStackTrace();
        }
    }
    public static void clickWithJS(WebElement element){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true); ",element);
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].click(); ",element);
    }
    public static void scrollTo(WebElement element){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);

    }

}
