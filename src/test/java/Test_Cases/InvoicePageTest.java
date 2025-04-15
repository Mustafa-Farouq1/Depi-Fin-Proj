package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class InvoicePageTest extends baseTest {
    LoginPage lp;
    AccountPage ap;

    @Test
    public void userInvoicePage(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        ap.setInvoiceButton();
    }
}
