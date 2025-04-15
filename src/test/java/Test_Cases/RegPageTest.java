package Test_Cases;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegPageTest extends baseTest{
    LoginPage lp;
    RegisterPage rp;

    @Test
    public void signNewUser() {
        lp = new LoginPage(baseDriver);
        rp = new RegisterPage(baseDriver);
        rp.regUserData("Depi", "Tester", "01011990", "Shoubra", "123456",
                "Cairo", "Cairo", "012345678910", "test@depi.com", "0123456789_Td");
    }

    @Test
    public void signWithNullData(){
        lp = new LoginPage(baseDriver);
        rp = new RegisterPage(baseDriver);
        rp.regNullMethod();
    }

    @Test
    public void sign_NewUser(){
        lp = new LoginPage(baseDriver);
        rp = new RegisterPage(baseDriver);
        rp.regUserData("Depi", "Tester", "01011990", "Shoubra", "123456",
                "Cairo", "Cairo", "Mmnmnmn", "test@depi.com", "0123");
    }

    @Test
    public void sign_NewWithWrongUserFormat(){
        lp = new LoginPage(baseDriver);
        rp = new RegisterPage(baseDriver);
        rp.regUserData("Depi", "Tester", "01011990", "Shoubra", "123456",
                "Cairo", "Cairo", "012345678910", "test@depi,com", "0123456789_td");
    }

}
