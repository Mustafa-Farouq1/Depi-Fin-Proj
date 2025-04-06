package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {
    WebDriver driver;
    WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
    By favoriteButton = By.cssSelector("body > app-root > div > app-overview > div > a:nth-child(1)");
    By profileButton = By.cssSelector("body > app-root > div > app-overview > div > a:nth-child(2)");
    By invoiceButton = By.cssSelector("body > app-root > div > app-overview > div > a:nth-child(3)");
    By messagesButton = By.cssSelector("body > app-root > div > app-overview > div > a:nth-child(4)");


    public void seeFavoriteButton(){
        WebElement favBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(favoriteButton));
        favBtn.isDisplayed();
    }
    public void setFavoriteButton(){
        WebElement favButton = wait.until(ExpectedConditions.elementToBeClickable(favoriteButton));
        favButton.click();
    }
    public void setProfileButton(){
        WebElement profilebtn = wait.until(ExpectedConditions.elementToBeClickable(profileButton));
        profilebtn.click();
    }
    public void setInvoiceButton(){
        WebElement invBtn = wait.until(ExpectedConditions.elementToBeClickable(invoiceButton));
        invBtn.click();
    }
    public void setMessagesButton(){
        WebElement messagesBtn = wait.until(ExpectedConditions.elementToBeClickable(messagesButton));
        messagesBtn.click();
    }
}

