package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }
    By openLP = By.cssSelector("#navbarSupportedContent > ul > li:nth-child(4) > a");
    By emailTxtBox = By.xpath("//*[@id=\"email\"]");
    By passwordBox = By.xpath("//*[@id=\"password\"]");
    By passwordVisBox = By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[2]/app-password-input/div/div/button");
    By loginButton = By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[3]/input");

    public void clickOpenLP() {
        WebElement openloginpage = wait.until(ExpectedConditions.elementToBeClickable(openLP));
        openloginpage.click();
    }
    public void setEmailTxtBox(String email){
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailTxtBox));
        emailField.sendKeys(email);
    }

    public void setPasswordBox(String password){
        WebElement passBox = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordBox));
                passBox.sendKeys(password);
    }
    public void clickPasswordVisBox(){
        WebElement passVisButton = wait.until(ExpectedConditions.elementToBeClickable(passwordVisBox));
        passVisButton.click();
    }
    public void clickLoginButton(){
        WebElement logBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        logBtn.click();
    }
}