package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }

    public void testAddToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id='btn-add-to-cart']"));
        addToCartButton.click();
        WebElement cartCount = driver.findElement(By.xpath("//span[contains(@class, 'cart-count')]"));
        String countText = cartCount.getText();
        Assert.assertEquals(countText, "1", "Item was not added to cart successfully");
    }

    public void testAddToFavorites() {

        WebElement addToFavoritesButton = driver.findElement(By.xpath("//*[@id='btn-add-to-favorites']"));
        addToFavoritesButton.click();
        String buttonClass = addToFavoritesButton.getAttribute("class");
        Assert.assertTrue(buttonClass.contains("favorited"), "Item was not added to favorites successfully");
    }
}
