package vytrack.login;

import com.cbt.utilities.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import vytrack.AbstractTestBase;

public class NewLoginTest extends AbstractTestBase {
    @Test
    public void verifyPageTitle(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");


    }


}
