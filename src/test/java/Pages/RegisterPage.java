package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    LoginPage lp;
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
     By regEgypt = By.xpath("//*[@id=\"country\"]/option[66]");
     By regPhoneNum = By.xpath("//*[@id=\"phone\"]");
     By regEmail = By.xpath("//*[@id=\"email\"]");
     By regPasswordBox = By.xpath("//*[@id=\"password\"]");
     By regVisPassBox = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[11]/app-password-input/div/div/button");
     By regCompleteButton = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/button");
     By firstNameBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[1]/div[2]/div");
     By secondNameBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[2]/div[2]");
     By bodBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[3]/div");
     By stBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[4]/div");
     By postalBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[5]/div[2]");
     By cityBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[6]/div[2]");
     By stateBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[7]/div[2]");
     By countryBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[8]/div[2]");
     By phoneBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[9]/div");
     By emailBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[10]/div");
     By passwordBoxError = By.xpath("/html/body/app-root/div/app-register/div/div/div/form/div/div[11]/div[3]");


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

    public void setRegCountry() {
        WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(regCountry));
        countryDropdown.click();
        WebElement egyptOption = wait.until(ExpectedConditions.elementToBeClickable(regEgypt));
        egyptOption.click();
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

    public String getFirstNameBoxError(){
        WebElement eBoxEM = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameBoxError));
        return eBoxEM.getText();
    }

    public boolean isFirstNameBoxError(){
        try {
            return driver.findElement(firstNameBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSecondNameBoxError(){
        WebElement eBoxEM = wait.until(ExpectedConditions.visibilityOfElementLocated(secondNameBoxError));
        return eBoxEM.getText();
    }

    public boolean isSecondNameBoxError(){
        try {
            return driver.findElement(secondNameBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getBODBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(bodBoxError));
        return errBox.getText();
    }

    public boolean isBODBoxError(){
        try {
            return driver.findElement(bodBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getSTBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(stBoxError));
        return errBox.getText();
    }

    public boolean isSTBoxError(){
        try {
            return driver.findElement(stBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPostalBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(postalBoxError));
        return errBox.getText();
    }

    public boolean isPostalBoxError(){
        try {
            return driver.findElement(postalBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCityBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(cityBoxError));
        return errBox.getText();
    }

    public boolean isCityBoxError(){
        try {
            return driver.findElement(cityBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getStateBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(stateBoxError));
        return errBox.getText();
    }

    public boolean isStateBoxError(){
        try {
            return driver.findElement(stateBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getCountryBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(countryBoxError));
        return errBox.getText();
    }

    public boolean isCountryBoxError(){
        try {
            return driver.findElement(countryBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPhoneBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneBoxError));
        return errBox.getText();
    }

    public boolean isPhoneBoxError(){
        try {
            return driver.findElement(phoneBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getEmailBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(emailBoxError));
        return errBox.getText();
    }

    public boolean isEmailBoxError(){
        try {
            return driver.findElement(emailBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getPasswordBoxError(){
        WebElement errBox = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordBoxError));
        return errBox.getText();
    }

    public boolean isPasswordBoxError(){
        try {
            return driver.findElement(passwordBoxError).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void regAssertion() {
        try {
            if (isFirstNameBoxError()) {
                String err = getFirstNameBoxError();
                Assert.assertEquals(err, "First name is required", "Unexpected First Name error.");
            }

            if (isSecondNameBoxError()) {
                String err = getSecondNameBoxError();
                Assert.assertEquals(err, "Last name is required", "Unexpected Last Name error.");
            }

            if (isBODBoxError()) {
                String err = getBODBoxError();
                Assert.assertEquals(err, "Date of Birth is required", "Unexpected DOB error.");
            }

            if (isSTBoxError()) {
                String err = getSTBoxError();
                Assert.assertEquals(err, "Street is required", "Unexpected Street error.");
            }

            if (isPostalBoxError()) {
                String err = getPostalBoxError();
                Assert.assertEquals(err, "Postcode is required", "Unexpected Postal Code error.");
            }

            if (isCityBoxError()) {
                String err = getCityBoxError();
                Assert.assertEquals(err, "City is required", "Unexpected City error.");
            }

            if (isStateBoxError()) {
                String err = getStateBoxError();
                Assert.assertEquals(err, "State is required", "Unexpected State error.");
            }

            if (isCountryBoxError()) {
                String err = getCountryBoxError();
                Assert.assertEquals(err, "Country is required", "Unexpected Country error.");
            }

            if (isPhoneBoxError()) {
                String err = getPhoneBoxError();
                Assert.assertEquals(err, "Phone is required.", "Unexpected Phone error.");
            }

            if (isPhoneBoxError()) {
                String err = getPhoneBoxError();
                Assert.assertEquals(err, "Only numbers are allowed.", "Unexpected Phone error.");
            }

            if (isEmailBoxError()) {
                String err = getEmailBoxError();
                if (err.equals("Email is required")) {
                    Assert.assertEquals(err, "Email is required", "Unexpected Email error.");
                } else if (err.equals("Email in wrong format")) {
                    Assert.assertEquals(err, "Email in wrong format", "Unexpected Email error.");
                } else {
                    Assert.fail("Unknown email error message: " + err);
                }
            }
            if (isPasswordBoxError()) {
                String err = getPasswordBoxError();
                boolean hasRequired = err.contains("Password is required");
                boolean hasMinLength = err.contains("Password must be minimal 6 characters long.");
                boolean hasInvalidChars = err.contains("Password can not include invalid characters.");

                if (hasRequired && hasMinLength && hasInvalidChars) {
                    Assert.assertTrue(true);
                }
                else if (hasRequired || hasMinLength || hasInvalidChars) {
                    Assert.assertTrue(true);
                } else {
                    Assert.fail("Unexpected Password error:\n" + err);
                }

            }

        } catch (Exception e) {
            Assert.fail("Exception during form error assertions: " + e.getMessage());
        }
    }

    public void regUserData(String FirstName, String LastName, String BOD , String address, String postal, String city,
                             String state, String Phone, String email, String Password){
        lp = new LoginPage(driver);
        lp.clickopenLP();
        openRP();
        setRegFirstnameTxtBox(FirstName);
        setRegLastnameTxtBox(LastName);
        setRegDateOfBirth(BOD);
        setRegAddress(address);
        setRegPostalCode(postal);
        setRegCity(city);
        setRegState(state);
        setRegCountry();
        setRegPhoneNum(Phone);
        setRegEmail(email);
        setRegPasswordBox(Password);
        clickRegVisPass();
        clickRegButton();
        regAssertion();
    }

    public void regNullMethod(){
        lp = new LoginPage(driver);
        lp.clickopenLP();
        openRP();
        clickRegButton();
        regAssertion();
    }

}