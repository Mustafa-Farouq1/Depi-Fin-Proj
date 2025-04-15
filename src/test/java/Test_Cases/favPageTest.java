package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import Pages.favoritePage;
import org.testng.annotations.Test;

public class favPageTest extends baseTest {
    LoginPage lp;
    AccountPage ap;
    favoritePage fp;

    @Test
    public void openFavPage(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        ap.setFavoriteButton();
    }

    @Test
    public void checkFavItems(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        fp = new favoritePage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        ap.setFavoriteButton();
        fp.seeFirstItem();
    }

    @Test
    public void delFavItems(){
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        fp = new favoritePage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        ap.setFavoriteButton();
        fp.seeFirstItem();
        fp.seeDel1stBTN();
        fp.setDel1stBTN();
    }
    // add product is waiting for ahmed
}
