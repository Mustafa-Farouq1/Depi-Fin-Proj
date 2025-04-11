package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends baseTest {
    LoginPage lp;


    @Test
    public void login_ValidUser() {
        lp = new LoginPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
    }

    @Test
    public void login_InValidUser() {
        lp = new LoginPage(baseDriver);
        lp.login_ea("test@depi.com", "012345678910");
    }


    @Test
    public void login_EmptyFields() {
        lp = new LoginPage(baseDriver);
        lp.login_ea("", "");
    }
}



