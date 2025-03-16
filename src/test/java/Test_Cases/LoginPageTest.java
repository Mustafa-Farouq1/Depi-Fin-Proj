package Test_Cases;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends baseTest{
    LoginPage lp;

    @Test
    public void loginValidUser(){
        lp = new LoginPage(baseDriver);
        lp.clickopenLP();
        lp.setEmailTxtBox("customer@practicesoftwaretesting.com");
        lp.setPasswordBox("welcome1");
        lp.clickPasswordVisBox();
        lp.clickloginButton();


    }



}
