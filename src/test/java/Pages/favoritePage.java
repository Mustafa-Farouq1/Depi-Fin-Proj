package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class favoritePage {
    WebDriver driver;
    WebDriverWait wait;

    public favoritePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    By delete1stBTN = By.xpath("/html/body/app-root/div/app-favorites/div/div[1]/div/div[3]/button");
    By delete2ndBTN = By.xpath("/html/body/app-root/div/app-favorites/div/div[2]/div/div[3]/button");
    By delete3rdBTN = By.xpath("/html/body/app-root/div/app-favorites/div/div[3]/div/div[3]/button");
    By itemCard1 = By.xpath("/html/body/app-root/div/app-favorites/div/div[1]/div");
    By itemCard2 = By.xpath("/html/body/app-root/div/app-favorites/div/div[2]/div");
    By itemCard3 = By.xpath("/html/body/app-root/div/app-favorites/div/div[3]/div");

    public void seeDel1stBTN() {
        WebElement delBTN = wait.until(ExpectedConditions.visibilityOfElementLocated(delete1stBTN));
        delBTN.isDisplayed();
    }

    public void setDel1stBTN(){
        WebElement delBTN = wait.until(ExpectedConditions.elementToBeClickable(delete1stBTN));
        delBTN.click();
    }

    public void seeDel2ndBTN() {
        WebElement delBTN = wait.until(ExpectedConditions.visibilityOfElementLocated(delete2ndBTN));
        delBTN.isDisplayed();
    }

    public void setDel2ndBTN(){
        WebElement delBTN = wait.until(ExpectedConditions.elementToBeClickable(delete2ndBTN));
        delBTN.click();
    }
    public void seeDel3rdBTN() {
        WebElement delBTN = wait.until(ExpectedConditions.visibilityOfElementLocated(delete3rdBTN));
        delBTN.isDisplayed();
    }

    public void setDel3rdBTN(){
        WebElement delBTN = wait.until(ExpectedConditions.elementToBeClickable(delete3rdBTN));
        delBTN.click();
    }

    public void seeFirstItem() {
        WebElement firstCard = wait.until(ExpectedConditions.visibilityOfElementLocated(itemCard1));
        firstCard.isDisplayed();
    }

    public void seeSecondItem() {
        WebElement secondCard = wait.until(ExpectedConditions.visibilityOfElementLocated(itemCard2));
        secondCard.isDisplayed();
    }

    public void seeThirdItem() {
        WebElement thirdCard = wait.until(ExpectedConditions.visibilityOfElementLocated(itemCard3));
        thirdCard.isDisplayed();
    }

}
