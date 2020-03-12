import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Delayer;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();

        Delayer.waitTimeGenerator(3);

        driver.get("http://practice.cybertekschool.com/dropdown");
        Delayer.waitTimeGenerator(4);

    }
}
