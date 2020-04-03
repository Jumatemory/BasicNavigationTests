package vytrack.login;

import com.cbt.utilities.pages.LoginPage;
import org.testng.annotations.Test;
import utilities.Driver;
import vytrack.TestBase;

public class NewLoginTest extends TestBase {
    @Test
    public void verifyPageTitle(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager85","UserUser123");
        System.out.println(Driver.getDriver().getTitle());


    }


}
