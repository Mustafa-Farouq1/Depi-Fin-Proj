package Test_Cases;

import Pages.ContactPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class contactPage extends baseTest {
    HomePage hp;
    ContactPage cp;

    @Test
    public void fillUnsignedUserMessageTest() {
        hp = new HomePage(baseDriver);
        cp = new ContactPage(baseDriver);
        cp.sendUnsignedUserMessage("M", "M", "test@depi.com",
                "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm"
        ,5);
    }
    @Test
    public void fillLogedUserMessageTest(){
        hp = new HomePage(baseDriver);
        cp = new ContactPage(baseDriver);
        cp.sendSignedUserMessage("customer@practicesoftwaretesting.com", "welcome01", 3,
                "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

}
