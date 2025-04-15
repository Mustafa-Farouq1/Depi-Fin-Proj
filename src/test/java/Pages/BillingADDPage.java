package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/// /-------03---------


public class BillingADDPage {
    WebDriver driver;

    public BillingADDPage(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By streetAdd = By.id("street");
    private By cityAdd = By.id("city");
    private By stateAdd = By.id("state");
    private By countryAdd = By.id("country");
    private By postalcodeAdd = By.id("postal_code");
    private By billAddBTN = By.cssSelector("[data-test='proceed-3']");


    //Actions
    public void InsertStreet(String street) {
        driver.findElement(streetAdd).clear();
        driver.findElement(streetAdd).sendKeys(street);
    }

    public void InsertCity(String city) {
        driver.findElement(cityAdd).clear();
        driver.findElement(cityAdd).sendKeys(city);
    }

    public void Insertstate(String satate) {
        driver.findElement(stateAdd).clear();
        driver.findElement(stateAdd).sendKeys(satate);
    }

    public void InsertCountry(String country) {
        driver.findElement(countryAdd).clear();
        driver.findElement(countryAdd).sendKeys(country);
    }

    public void InsertPostalcode(String postalcode) {
        driver.findElement(postalcodeAdd).clear();
        driver.findElement(postalcodeAdd).sendKeys(postalcode);
    }

    public PaymentPage billAddBTN() {
        driver.findElement(billAddBTN).click();
        return new PaymentPage(driver);
    }

}
