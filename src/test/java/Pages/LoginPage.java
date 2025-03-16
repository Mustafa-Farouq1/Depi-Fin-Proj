package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {WebDriver driver;
    public LoginPage(WebDriver driver) {
    this.driver = driver;
    }
    By openLP = By.xpath("//a[contains(@href,'/auth/login')]");
    By emailTxtBox = By.id("email");
    By PasswordBox = By.xpath("//*[@id=\"password\"]");
    By PasswordVisBox = By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[2]/app-password-input/div/div/button");
    By loginButton = By.xpath("/html/body/app-root/div/app-login/div/div/div/form/div[3]/input");

    public void clickopenLP (){
        driver.findElement(openLP).click();
    }
    public void setEmailTxtBox(String email){
    driver.findElement(emailTxtBox).sendKeys(email);
    }
    public void setPasswordBox(String password){
        driver.findElement(PasswordBox).sendKeys(password);
    }
    public void clickPasswordVisBox(){
        driver.findElement(PasswordVisBox).click();
    }
    public void clickloginButton(){
        driver.findElement(loginButton).click();
    }


}

/*
.sendKeys("welcome01")
 */