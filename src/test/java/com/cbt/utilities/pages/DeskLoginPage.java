package com.cbt.utilities.pages;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;



public class DeskLoginPage {
    WebDriverWait wait ;
    Actions actions;

    @FindBy(xpath = "//input[@name = 'ctl00$ContentPlaceHolder1$ctlRCCSMeritLogin$UserName' and @id='ctl00_ContentPlaceHolder1_ctlRCCSMeritLogin_UserName']")
    private WebElement usernameInput;

    @FindBy(name = "ctl00$ContentPlaceHolder1$ctlRCCSMeritLogin$Password")
    private WebElement passwordInput;
    @FindBy(name = "ctl00$ContentPlaceHolder1$ctlRCCSMeritLogin$LoginButton")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='dxnb-ghtext' and contains(text(),'BRIS Tickets')]")
    private WebElement brisTicketLink;

    @FindBy(linkText = "New")
    private WebElement newLink;

    @FindBy(xpath = "//input[@name='ctl00$ASPxSplitter1$ContentPlaceHolder1$ASPxPageControl1$UnAgrid$DXPEForm$efnew$DXEFL$DXEditor4']")
    private WebElement createdByInput;
    @FindBy(xpath = "//table[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor11']/tbody/tr/td[3]")
    private WebElement deptDropDown;
    @FindBy(xpath =  "//table[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor11']/tbody/tr/td[2]//child::input")
    private WebElement dept;
    @FindBy(xpath ="//table[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor4']/tbody/tr/td//child::input" )
    private  WebElement openByInput;

    @FindBy(xpath = "//input[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor3_I' and @name='ctl00$ASPxSplitter1$ContentPlaceHolder1$ASPxPageControl1$UnAgrid$DXPEForm$efnew$DXEFL$DXEditor3']")
    private WebElement endUserInput;
    @FindBy(xpath = "//input[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor5_I' and @name='ctl00$ASPxSplitter1$ContentPlaceHolder1$ASPxPageControl1$UnAgrid$DXPEForm$efnew$DXEFL$DXEditor5']")
    private WebElement phoneInput;
    @FindBy(xpath = "//textarea[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor16_I' and @name='ctl00$ASPxSplitter1$ContentPlaceHolder1$ASPxPageControl1$UnAgrid$DXPEForm$efnew$DXEFL$DXEditor16']")
    private WebElement summaryInput;
    @FindBy(xpath = "//textarea[@id='ctl00_ASPxSplitter1_ContentPlaceHolder1_ASPxPageControl1_UnAgrid_DXPEForm_efnew_DXEFL_DXEditor17_I' and @name='ctl00$ASPxSplitter1$ContentPlaceHolder1$ASPxPageControl1$UnAgrid$DXPEForm$efnew$DXEFL$DXEditor17']")
    private WebElement descriptionInput;

    @FindBy(xpath = ".//td[text()='17380']")
    private WebElement ticketNumber;
    @FindBy(linkText = "Update")
    private WebElement cancelLink;
    public DeskLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void login(String username, String password ){
        this.usernameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);

    }
    public void clickOnLoginButton(){
        loginButton.click();

    }
    public void clickONBrisTicket(){
       brisTicketLink.click();

    }
    public void createNewTicket(){
//        wait.until(ExpectedConditions.visibilityOf(newLink)).click();

        newLink.click();

    }
    public void setOPenByInput(String openBy){
        createdByInput.sendKeys(openBy);

    }
    public void clickOnDeptDrop(){
        deptDropDown.click();
    }
    public void selectDep(String deptName){
       dept.sendKeys(deptName);
       dept.click();

    }
    public void setOpenByName(String opener){
        openByInput.sendKeys(opener);
    }


    public void setEndUserInput(String endUser) throws InterruptedException {

        endUserInput.sendKeys(endUser);


    }
    public void setPhoneInput(String phoneNumber){
        phoneInput.sendKeys(phoneNumber);
    }
    public void setSummaryInput (String summary){
        summaryInput.sendKeys(summary);
    }
    public void setDescriptionInput(String description){
        descriptionInput.sendKeys(description);
    }
    public void cancel(){
        cancelLink.click();
    }
    public void closeTicket(String tNumber){
        String ticketNumber = ".//td[text()='"+tNumber+"']";
    }


}
