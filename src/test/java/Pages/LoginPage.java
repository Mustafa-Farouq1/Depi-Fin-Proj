package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage {
    LoginPage lp;
    AccountPage ap;
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By openLP = By.xpath("//a[contains(@href,'/auth/login')]");
    By emailTxtBox = By.id("email");
    By PasswordBox = By.xpath("//*[@id=\"password\"]");
    By PasswordVisBox = By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[2]/app-password-input/div/div/button");
    By loginButton = By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[3]/input");
    By eBoxErrorMessage = By.xpath("//*[@id=\"email-error\"]");
    By pBoxErrorMessage = By.xpath("//*[@id=\"password-error\"]");
    By inValidErrorMessage = By.xpath("/html/body/app-root/div/app-login/div/div/div/div[4]");

    public void clickopenLP() {
        WebElement oLP = wait.until(ExpectedConditions.visibilityOfElementLocated(openLP));
        oLP.click();
    }

    public void setEmailTxtBox(String email) {
        WebElement eBox = wait.until(ExpectedConditions.visibilityOfElementLocated(emailTxtBox));
        eBox.clear();
        eBox.sendKeys(email);
    }

    public void setPasswordBox(String password) {
        WebElement pBox = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordBox));
        pBox.clear();
        pBox.sendKeys(password);
    }

    public void clickPasswordVisBox() {
        WebElement pBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordVisBox));
        pBtn.click();
    }

    public void clickloginButton() {
        WebElement lBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        lBtn.click();
    }

    public String getEBoxErrorMessage() {
        WebElement eBoxEM = wait.until(ExpectedConditions.visibilityOfElementLocated(eBoxErrorMessage));
        return eBoxEM.getText();
    }

    public String getPBoxErrorMessage() {
        WebElement pBoxEM = wait.until(ExpectedConditions.visibilityOfElementLocated(pBoxErrorMessage));
        return pBoxEM.getText();
    }

    public String getInValidErrorMessage() {
        WebElement inVEM = wait.until(ExpectedConditions.visibilityOfElementLocated(inValidErrorMessage));
        return inVEM.getText();
    }

    public boolean isEBoxErrorMessageDisplayed() {
        try {
            return driver.findElement(eBoxErrorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isPBoxErrorMessageDisplayed() {
        try {
            return driver.findElement(pBoxErrorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isInValidErrorMessageDisplayed() {
        try {
            return driver.findElement(inValidErrorMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAnyErrorMessageDisplayed() {
        return isEBoxErrorMessageDisplayed() || isPBoxErrorMessageDisplayed() || isInValidErrorMessageDisplayed();
    }

    public void login_ea(String email, String pass) {
        clickopenLP();
        setEmailTxtBox(email);
        setPasswordBox(pass);
        clickPasswordVisBox();
        clickloginButton();

        try {
            ap = new AccountPage(driver); // Initialize ap
            ap.seeFavoriteButton();
        } catch (Exception e) {
            if (isInValidErrorMessageDisplayed()) {
                String actualInvalidError = getInValidErrorMessage();
                String expectedInvalidError = "Invalid email or password"; // Adjust this if needed
                Assert.assertEquals(actualInvalidError.trim(), expectedInvalidError,
                        "Invalid login error message does not match expected");
            } else if (isEBoxErrorMessageDisplayed() || isPBoxErrorMessageDisplayed()) {
                String actualEBoxError = getEBoxErrorMessage();
                String actualPBoxError = getPBoxErrorMessage();
                String expectedEBoxError = "Email is required";
                String expectedPBoxError = "Password is required";
                Assert.assertEquals(actualEBoxError.trim(), expectedEBoxError,
                        "Email error message text does not match expected");
                Assert.assertEquals(actualPBoxError.trim(), expectedPBoxError,
                        "Password error message text does not match expected");
            } else {
                Assert.fail("No valid or expected error message was displayed.");
            }
        }
    }


}
