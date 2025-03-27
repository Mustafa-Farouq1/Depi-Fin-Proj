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
        lp.clickOpenLP();
        lp.setEmailTxtBox("customer@practicesoftwaretesting.com");
        lp.setPasswordBox("welcome1");
        lp.clickPasswordVisBox();
        lp.clickLoginButton();
        ap.seeFavoriteButton();


    }

    @Test
    public void loginUNVALIDUser(){
        lp = new LoginPage(baseDriver);
        lp.clickOpenLP();
        lp.setEmailTxtBox("test@depi.com");
        lp.setPasswordBox("012345678910_111111");
        lp.clickPasswordVisBox();
        lp.clickLoginButton();
    }

    @Test
    public void loginEmptyFields(){
        lp = new LoginPage(baseDriver);
        lp.clickOpenLP();
        lp.setEmailTxtBox("");
        lp.setPasswordBox("");
        lp.clickPasswordVisBox();
        lp.clickLoginButton();
    }



}
