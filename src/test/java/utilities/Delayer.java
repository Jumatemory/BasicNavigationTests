package utilities;

import org.openqa.selenium.WebElement;

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
            textValues.add(element.getText());

        }
        return textValues;
    }

}
