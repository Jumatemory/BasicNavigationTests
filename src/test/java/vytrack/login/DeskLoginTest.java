package vytrack.login;

import com.cbt.utilities.pages.DeskLoginPage;
import org.testng.annotations.Test;
;

public class DeskLoginTest  {
    DeskLoginPage deskLoginPage = new DeskLoginPage();



    @Test
    public void testLogin() throws InterruptedException {
        deskLoginPage.login("jgul",")Case@255");
        deskLoginPage.clickOnLoginButton();
        deskLoginPage.clickONBrisTicket();
        deskLoginPage.createNewTicket();



        deskLoginPage.clickOnDeptDrop();

        deskLoginPage.selectDep("Aging");
        deskLoginPage.setOpenByName("juma");
        deskLoginPage.setEndUserInput("Spencer Lane");
        deskLoginPage.setPhoneInput("2654");
        deskLoginPage.setSummaryInput("WAV files cannot be played on the user laptop");
        deskLoginPage.setDescriptionInput("codec needs to be installed on the laptop so that WAV files can be played " +
                " and also the USB port needs to be unlocked");
        Thread.sleep(5000);
        deskLoginPage.cancel();






    }
    @Test
    public void testEndUserField() throws InterruptedException {
        deskLoginPage.login("jgul",")Case@255");
        deskLoginPage.clickOnLoginButton();
        deskLoginPage.clickONBrisTicket();
        deskLoginPage.createNewTicket();
        deskLoginPage.setEndUserInput("Spencer Lane");

    }

}
