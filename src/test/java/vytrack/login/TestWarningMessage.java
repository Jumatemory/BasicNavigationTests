package vytrack.login;

import com.cbt.utilities.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import vytrack.AbstractTestBase;

public class TestWarningMessage extends AbstractTestBase {

    @Test
    public void verifyWarningMessage(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("wrong","wrong");
        Assert.assertEquals(loginPage.getWarningMessageText(),"Invalid user name or password.");

    }
}
