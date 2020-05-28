package vytrack.fleet;

import com.cbt.utilities.pages.LoginPage;
import com.cbt.utilities.pages.fleet.VehiclePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Delayer;
import utilities.Driver;
import vytrack.AbstractTestBase;


public class NewVehiclePageTests extends AbstractTestBase {



    @Test
    public void verifyTitle(){
        LoginPage loginPage = new LoginPage();
        VehiclePage vehiclePage = new VehiclePage();
        loginPage.login();
        vehiclePage.navigateTo("Fleet","Vehicles");

        String expectedTitle = "All - Car - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
