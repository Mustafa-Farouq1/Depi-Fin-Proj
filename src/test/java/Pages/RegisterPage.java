package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
     By regOpenRP = By.partialLinkText("Register your account");
     By regFirstnameTxtBox = By.xpath("//*[@id=\"first_name\"]");
     By regLastnameTxtBox = By.xpath("//*[@id=\"last_name\"]");
     By regDateOfBirth = By.xpath("//*[@id=\"dob\"]");
     By regAddress = By.xpath("//*[@id=\"street\"]");
     By regPostalCode = By.xpath("//*[@id=\"postal_code\"]");
     By regCity = By.xpath("//*[@id=\"city\"]");
     By regState = By.xpath("//*[@id=\"state\"]");
     By regCountry = By.xpath("//*[@id=\"country\"]");
     By regPhoneNum = By.xpath("//*[@id=\"phone\"]");
     By regEmail = By.xpath("//*[@id=\"email\"]");
     By regPasswordBox = By.xpath("//*[@id=\"password\"]");
     By regVisPassBox = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[11]/app-password-input/div/div/button");
     By regCompleteButton = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button");

     public void openRP(){
         WebElement regPage = wait.until(ExpectedConditions.elementToBeClickable(regOpenRP));
         regPage.click();
     }

     public void setRegFirstnameTxtBox(String regFirstName){
         WebElement fBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regFirstnameTxtBox));
         fBox.clear();
         fBox.sendKeys(regFirstName);
     }

     public void setRegLastnameTxtBox(String regLastName){
         WebElement lBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regLastnameTxtBox));
         lBox.clear();
         lBox.sendKeys(regLastName);
     }

     public void setRegDateOfBirth(String regDOB){
         WebElement regBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regDateOfBirth));
         regBox.clear();
         regBox.sendKeys(regDOB);
     }

     public void setRegAddress(String regAdd){
         WebElement addBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regAddress));
         addBox.clear();
         addBox.sendKeys(regAdd);
     }

     public void setRegPostalCode(String regPC){
         WebElement pBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regPostalCode));
         pBox.clear();
         pBox.sendKeys(regPC);
     }

     public void setRegCity(String City1){
         WebElement cBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regCity));
         cBox.clear();
         cBox.sendKeys(City1);
     }

     public void setRegState(String State){
         WebElement sBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regState));
         sBox.clear();
         sBox.sendKeys(State);
     }

     public void setRegCountry(){
         driver.findElement(regCountry).findElement(By.xpath("//*[@id=\"country\"]/option[66]")).click();

     }

     public void setRegPhoneNum(String phoneNum){
         WebElement nBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regPhoneNum));
         nBox.clear();
         nBox.sendKeys(phoneNum);
     }

     public void setRegEmail(String Email1) {
         WebElement eBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regEmail));
         eBox.clear();
         eBox.sendKeys(Email1);
    }

    public void setRegPasswordBox(String regPass){
        WebElement pBox = wait.until(ExpectedConditions.visibilityOfElementLocated(regPasswordBox));
        pBox.clear();
        pBox.sendKeys(regPass);
    }

    public void clickRegVisPass(){
         driver.findElement(regVisPassBox).click();
    }

    public void clickRegButton(){
         driver.findElement(regCompleteButton).click();
    }


}
/*
.sendKeys("Depi")
.sendKeys("Tester")
.sendKeys("01011990")
.sendKeys("Cairo")
.sendKeys("12345")
.sendKeys("Cairo")
.sendKeys("Cairo")
.findElement(By.xpath("//*[@id=\"country\"]/option[66]")).click()
.sendKeys("012345678910")
.sendKeys("m@gmail.com")
.sendKeys("0123456789_Td")
.click()
.click()

 */