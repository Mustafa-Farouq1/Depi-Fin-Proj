package Test_Cases;

import Pages.AccountPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends baseTest{
    LoginPage lp;
    AccountPage ap;

    public void login_ea(String email,String pass )
    {
        lp = new LoginPage(baseDriver);
        ap = new AccountPage(baseDriver);
        lp.clickopenLP();
        lp.setEmailTxtBox(email);
        lp.setPasswordBox(pass);
        lp.clickPasswordVisBox();
        lp.clickloginButton();
    }

    @Test
    public void login_ValidUser(){
        login_ea("customer@practicesoftwaretesting.com","welcome01");
        ap.seeFavoriteButton();
        Assert.assertFalse(lp.isAnyErrorMessageDisplayed(),
                "No error messages should be displayed for valid login");
    }
    @Test
    public void login_InValidUser(){
        login_ea("test@depi.com", "012345678910");
        if (lp.isInValidErrorMessageDisplayed()) {
            String actualInvalidError = lp.getInValidErrorMessage();
            String expectedInvalidError = "Invalid email or password"; // Adjust this
            Assert.assertEquals(actualInvalidError.trim(), expectedInvalidError,
                    "Email error message text does not match expected");
        }
    }
    @Test
    public void login_EmptyFields(){
        login_ea("", "");
        if (lp.isEBoxErrorMessageDisplayed() || lp.isPBoxErrorMessageDisplayed()) {
            String actualEBoxError = lp.getEBoxErrorMessage();
            String actualPBoxError = lp.getPBoxErrorMessage();
            String expectedEBoxError= "Email is required";
            String expectedPBoxError= "Password is required";
            Assert.assertEquals(actualEBoxError.trim(), expectedEBoxError,
                    "Email error message text does not match expected");
            Assert.assertEquals(actualPBoxError.trim(), expectedPBoxError,
                    "Password error message text does not match expected");
        }
    }


}
