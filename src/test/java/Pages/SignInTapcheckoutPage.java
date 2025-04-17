package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/// /-------02---------
public class SignInTapcheckoutPage {

    static WebDriver driver;

    public SignInTapcheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By signInTapcheckoutBTN = By.xpath("/html/body/app-root/div/app-checkout/aw-wizard/div/aw-wizard-step[1]/app-cart/div/div/button");
    private By ErrorMSG = By.xpath("//*[@id=\"toast-container\"]/div/div[1]");

//Action

    public void SignInTapcheckoutPage() {
        driver.findElement(signInTapcheckoutBTN).click();
    }


}
