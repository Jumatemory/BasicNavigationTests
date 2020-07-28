package vytrack.login;

import com.cbt.utilities.pages.LoginPage;
import org.testng.annotations.Test;
import utilities.Driver;


public class NewLoginTest  {
    @Test
    public void verifyPageTitle(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager85","UserUser123");
        System.out.println(Driver.getDriver().getTitle());
        Driver.closeDriver();


    }


}
