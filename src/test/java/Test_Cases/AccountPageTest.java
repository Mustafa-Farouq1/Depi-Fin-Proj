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
        lp.clickOpenLP();
        lp.setEmailTxtBox("customer@practicesoftwaretesting.com");
        lp.setPasswordBox("welcome1");
        lp.clickPasswordVisBox();
        lp.clickLoginButton();
        ap.setFavoriteButton();
        ap.setProfileButton();
        ap.setInvoiceButton();
        ap.setMessagesButton();
    }
}
