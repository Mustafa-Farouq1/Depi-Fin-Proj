package Test_Cases;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class productPageTests extends baseTest {
    LoginPage lp;
    HomePage hp;
    ProductPage pp;

    @Test
    public void login_ValidUser() {
        WebDriverWait wait = new WebDriverWait(baseDriver, Duration.ofSeconds(20));
        lp = new LoginPage(baseDriver);
        hp = new HomePage(baseDriver);
        pp = new ProductPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        hp.Click_Home_btn();
        hp.verifyFirst();
        baseDriver.findElement(By.id("btn-add-to-cart")).click();
        By toastLocator = By.id("dtoast-container");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
        By cartLocator = By.cssSelector("[data-test='nav-cart']");
        WebElement cartLink = wait.until(ExpectedConditions.elementToBeClickable(cartLocator));
        cartLink.click();
    }
}
