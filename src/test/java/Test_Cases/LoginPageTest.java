package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends baseTest{
    LoginPage lp;
    AccountPage ap;

    @Test
    public void loginValidUser(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.clickopenLP();
        lp.setEmailTxtBox("customer@practicesoftwaretesting.com");
        lp.setPasswordBox("welcome01");
        lp.clickPasswordVisBox();
        lp.clickloginButton();
        ap.seeFavoriteButton();

    }
    @Test
    public void loginInValidUser(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.clickopenLP();
        lp.setEmailTxtBox("test@depi.com");
        lp.setPasswordBox("012345678910");
        lp.clickPasswordVisBox();
        lp.clickloginButton();
        ap.seeFavoriteButton();
    }


}
