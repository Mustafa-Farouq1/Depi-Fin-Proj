package Test_Cases;

import Pages.AccountPage;
import Pages.InvoicePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class InvoiceTestCases extends baseTest {
    LoginPage lp;
    InvoicePage Ip;


    @Test
    public void InvDetail() {
        lp = new LoginPage(baseDriver);
        lp.login_ea("customer@practicesoftwaretesting.com", "welcome01");
        WebDriverWait wait = new WebDriverWait(baseDriver, Duration.ofSeconds(10));
        WebElement accMenu = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-menu']")));
        accMenu.click();
        WebElement myInvoices = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='nav-my-invoices']")));
        myInvoices.click();
        baseDriver.findElement(By.xpath("/html/body/app-root/div/app-invoices/table/tbody/tr[1]/td[5]/a")).click();


    }

    @Test
    public void InvDownload() {

        InvDetail();
        baseDriver.findElement(By.xpath("/html/body/app-root/div/app-details/div/div[1]/div/button")).click();

    }

}
