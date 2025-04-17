package Pages;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactPage {
    WebDriver driver;
    WebDriverWait wait;
    HomePage hp;
    LoginPage lp;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    private By firstNameField = By.xpath("//*[@id=\"first_name\"]");
    private By lastNameField = By.xpath("//*[@id=\"last_name\"]");
    private By emailField = By.xpath("//*[@id=\"email\"]");
    private By subjectField = By.xpath("//*[@id=\"subject\"]");
    private By messageField = By.xpath("//*[@id=\"message\"]");
    private By attachmentField = By.xpath("//*[@id=\"attachment\"]");
    private By submitBtn = By.xpath("/html/body/app-root/div/app-contact/div/div/div/form/div/div[2]/div[4]/input");

    public void setFirstNameField(String firstname) {
        WebElement first = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        first.sendKeys(firstname);
    }
    public void setLastNameField(String lastname) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        element.sendKeys(lastname);
    }
    public void setEmailField(String email){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        element.sendKeys(email);
    }
    public WebElement getSubjectField(){
        return driver.findElement(subjectField);
    }
//    public void validSubjectDropDown(String methodName) {
//        Select sortDropdown = new Select(getSubjectField());
//        sortDropdown.selectByVisibleText(methodName);
//    }
    public void setMessageField(String message){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageField));
        element.sendKeys(message);
    }
    public void uploadAttachment(String filePath) {
        WebElement attach = wait.until(ExpectedConditions.visibilityOfElementLocated(attachmentField));
        attach.sendKeys(filePath);
    }
    public void selectSubjectByIndex(int index) {
        Select subjectDropdown = new Select(getSubjectField());
        subjectDropdown.selectByIndex(index);
    }
    public void setSubmitBtn() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
        element.click();
    }
    //    Index Mapping:
//     0 - "Customer service"
//     1 - "Return"
//     2 - "webmaster"
//     3 - "payments"
//     4 - "Warranty"
//     5 - "status-of-order"

    public void sendUnsignedUserMessage(String firstname, String lastname,String email, String message,  int subjectIndex){
        hp = new HomePage(driver);
        hp.Click_Contact_btn();
        setFirstNameField(firstname);
        setLastNameField(lastname);
        setEmailField(email);
        selectSubjectByIndex(subjectIndex);
//        validSubjectDropDown("Customer service");
//        validSubjectDropDown("Return");
//        validSubjectDropDown("webmaster");
//        validSubjectDropDown("payments");
//        validSubjectDropDown("Warranty");
//        validSubjectDropDown("status-of-order");
        setMessageField(message);
        setSubmitBtn();
    }
    public void sendSignedUserMessage( String email, String pass, int subjectIndex,String message){
        hp = new HomePage(driver);
        lp = new LoginPage(driver);
        lp.login_ea(email,pass);
        hp.Click_Contact_btn();
        selectSubjectByIndex(subjectIndex);
//        validSubjectDropDown("Customer service");
//        validSubjectDropDown("Return");
//        validSubjectDropDown("webmaster");
//        validSubjectDropDown("payments");
//        validSubjectDropDown("Warranty");
//        validSubjectDropDown("status-of-order");
        setMessageField(message);
        setSubmitBtn();
    }
}
