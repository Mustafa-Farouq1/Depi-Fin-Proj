package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/// /-------04---------


public class PaymentPage {
    WebDriver driver;
    WebDriverWait wait;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
//    payment-method
//---Option1----BankTransfer\
    private By bankName = By.id("bank_name");
    private By accountName = By.id("account_name");
    private By accountNumber = By.id("account_number");


//---Option2----Cash On Delivery\

    //---Option3----Credit Card\
    private By creditCardNumber = By.id("credit_card_number");
    private By expirationDate = By.id("expiration_date");
    private By cvv = By.id("cvv");
    private By cardHolderName = By.id("card_holder_name");
    By Sort = By.cssSelector("[data-test='payment-method']");
    By Nav_Sort = By.cssSelector("[data-test='nav-my-invoices']");
//---Option4----BuyNowPayLater\
// //   Option1-Option2-Option3-Option4


    //---Option5----Gift Card\
    private By giftCardNumber = By.id("gift_card_number");
    private By validationCode = By.id("validation_code");

    //Confirm Button
    private By confirmBTN =
            By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-completion-step/app-payment/div/div/div/div");
    private By validationMessage = By.cssSelector("[data-test='payment-success-message']");

    public WebElement get_Sort() {
        return driver.findElement(Sort);
    }

//    public WebElement Nav_Sort() {
//        return driver.findElement(Nav_Sort);
//    }

    /// /Actions
//---Option1----BankTransfer\
    public void BankName(String bkName) {
        driver.findElement(bankName).clear();
        driver.findElement(bankName).sendKeys(bkName);
    }

    public void AccountName(String accName) {
        driver.findElement(accountName).clear();
        driver.findElement(accountName).sendKeys(accName);
    }

    public void AccountNumber(String accNumber) {
        driver.findElement(accountNumber).clear();
        driver.findElement(accountNumber).sendKeys(accNumber);
    }

//---Option2----Cash On Delivery\


    //---Option3----Credit Card\
    public void CreditCardNumber(String creCardNumber) {
        driver.findElement(creditCardNumber).clear();
        driver.findElement(creditCardNumber).sendKeys(creCardNumber);
    }

    public void ExpirationDate(String exDate) {
        driver.findElement(expirationDate).clear();
        driver.findElement(expirationDate).sendKeys(exDate);
    }

    public void CVV(String cvvNum) {
        driver.findElement(cvv).clear();
        driver.findElement(cvv).sendKeys(cvvNum);
    }

    public void CardHolderName(String CHName) {
        driver.findElement(cardHolderName).clear();
        driver.findElement(cardHolderName).sendKeys(CHName);
    }


//---Option4----BuyNowPayLater\
// //   Option1-Option2-Option3-Option4


    //---Option5----BuyNowPayLater\
    public void GiftCardNumber(String GCNumber) {
        driver.findElement(giftCardNumber).clear();
        driver.findElement(giftCardNumber).sendKeys(GCNumber);
    }

    public void ValidationCode(String VCode) {
        driver.findElement(validationCode).clear();
        driver.findElement(validationCode).sendKeys(VCode);
    }

    //----ConfirmButton
    public void ConfirmBTN() {

        driver.findElement(confirmBTN).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(validationMessage).getText();

    }

}
