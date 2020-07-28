package vytrack;

import com.cbt.utilities.pages.ApplicationPage;
import org.testng.annotations.Test;


public class ApplicationTest  {

    ApplicationPage application = new ApplicationPage();

    @Test
    public void test1(){
        application.setSearchInput("cashier");
        application.setLocationInput("Albany,NY");
        application.clickSearchButton();
        application.clickOnJobLink();
        application.clickApplyLInk();
        application.clickOnAgreeCheckBox();
        application.clickOnContinueButton();
    }

}
