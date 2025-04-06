package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AccountPageTest extends baseTest {
    LoginPage lp;
    AccountPage ap;

    @Test
    public void userLogedPage(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.clickopenLP();
        lp.setEmailTxtBox("customer@practicesoftwaretesting.com");
        lp.setPasswordBox("welcome01");
        lp.clickPasswordVisBox();
        lp.clickloginButton();
        ap.setFavoriteButton();
        baseDriver.navigate().back();
    }
    @Test
    public void userProfilePage(){
       ap = new AccountPage(baseDriver);
        ap.setProfileButton();
        baseDriver.navigate().back();
    }
    @Test
    public void userMessagesPage(){
        ap = new AccountPage(baseDriver);
        ap.setMessagesButton();
        baseDriver.navigate().back();
    }
    @Test
    public void userInvoicePage() {
        ap = new AccountPage(baseDriver);
        ap.setInvoiceButton();
        baseDriver.navigate().back();
    }
}

