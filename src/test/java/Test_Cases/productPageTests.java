package Test_Cases;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class productPageTests extends baseTest {
    LoginPage lp;
    HomePage hp;
    ProductPage pp;
    @Test
    public void login_ValidUser() {
        lp = new LoginPage(baseDriver);
        hp = new HomePage(baseDriver);
        pp = new ProductPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        hp.Click_Home_btn();
        hp.verifyFirst();
        pp.testAddToCart();
    }
}
