package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    @FindBy(id ="prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;
    public WebElement login;




    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
