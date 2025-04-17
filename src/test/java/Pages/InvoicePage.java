package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvoicePage {
    WebDriver driver;
    WebDriverWait wait;

    public InvoicePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Locators
    WebElement detailsButton = driver.findElement(By.xpath("/html/body/app-root/div/app-invoices/table/tbody/tr[1]/td[5]/a"));

    //    By detailsButton = By.cssSelector("body > app-root > div > app-invoices > table > tbody > tr:nth-child(1) > td:nth-child(5) > a");
    By invoiceDownload = By.cssSelector("[data-test='download-invoice']");


    //Actions
    public void InvDetails() {
        WebElement detailsButton = driver.findElement(By.className("mr-1"));

//       WebElement detailsButton = driver.findElement(By.cssSelector("a.btn.btn-sm.btn-primary"));
        detailsButton.click();
    }

    public void invoiceDownload() {
        driver.findElement(invoiceDownload).click();

    }

}
