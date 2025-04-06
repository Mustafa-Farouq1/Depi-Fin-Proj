package Test_Cases;

import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegPageTest extends baseTest{
    LoginPage lp;
    RegisterPage rp;

    @Test
    public void signNewUser(){
        lp = new LoginPage(baseDriver);
        rp = new RegisterPage(baseDriver);
        lp.clickopenLP();
        rp.openRP();
        rp.setRegFirstnameTxtBox("DEPI");
        rp.setRegLastnameTxtBox("Tester");
        rp.setRegDateOfBirth("01011990");
        rp.setRegAddress("Shoubra");
        rp.setRegPostalCode("123456");
        rp.setRegCity("Cairo");
        rp.setRegState("Cairo");
        rp.setRegCountry();
        rp.setRegPhoneNum("012345678910");
        rp.setRegEmail("tester@depi.com");
        rp.setRegPasswordBox("0123456789_Td");
        rp.clickRegVisPass();
        rp.clickRegButton();
    }
}
