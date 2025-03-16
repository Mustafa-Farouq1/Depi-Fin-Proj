package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegsiterPage { WebDriver driver;
    public RegsiterPage(WebDriver driver){
        this.driver = driver;
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
         driver.findElement(regOpenRP).click();
     }
     public void setRegFirstnameTxtBox(String regFirstName){
         driver.findElement(regFirstnameTxtBox).sendKeys(regFirstName);
     }
     public void setRegLastnameTxtBox(String regLastName){
         driver.findElement(regLastnameTxtBox).sendKeys(regLastName);
     }
     public void setRegDateOfBirth(String regDOB){
         driver.findElement(regDateOfBirth).sendKeys(regDOB);
     }
     public void setRegAddress(String regAdd){
         driver.findElement(regAddress).sendKeys(regAdd);
     }
     public void setRegPostalCode(String regPC){
         driver.findElement(regPostalCode).sendKeys(regPC);
     }
     public void setRegCity(String City1){
         driver.findElement(regCity).sendKeys(City1);
     }
     public void setRegState(String State){
         driver.findElement(regState).sendKeys(State);
     }
     public void setRegCountry(){
         driver.findElement(regCountry).findElement(By.xpath("//*[@id=\"country\"]/option[66]")).click();

     }
     public void setRegPhoneNum(String phoneNum){
         driver.findElement(regPhoneNum).sendKeys(phoneNum);
     }
     public void setRegEmail(String Email1) {
         driver.findElement(regEmail).sendKeys(Email1);
    }
    public void setRegPasswordBox(String regPass){
         driver.findElement(regPasswordBox).sendKeys(regPass);
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