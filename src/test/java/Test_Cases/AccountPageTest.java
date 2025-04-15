package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class AccountPageTest extends baseTest {
    LoginPage lp;
    AccountPage ap;

    @Test
    public void userLogedPage(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com","welcome01");
        ap.setFavoriteButton();
    }
    @Test
    public void userProfilePage(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com","welcome01");
        ap.setProfileButton();
    }
    @Test
    public void userMessagesPage(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com","welcome01");
        ap.setMessagesButton();
    }
    @Test
    public void userInvoicePage() {
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com","welcome01");
        ap.setInvoiceButton();
    }
}

