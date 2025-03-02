package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://seleniumbase.io/demo_page");


        driver.findElement(By.cssSelector("#myTextInput")).sendKeys("Mustafa");

        driver.findElement(By.cssSelector("#myTextarea")).sendKeys("Farouq");

        WebElement c = driver.findElement(By.xpath("//*[@id=\"myTextInput2\"]"));
        c.clear();
        c.sendKeys("Shaheen");

        driver.findElement(By.xpath("//*[@id=\"myButton\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"placeholderText\"]")).sendKeys("CAI2_SWD6_G5");

        WebElement one = driver.findElement(By.xpath("//*[@id=\"mySlider\"]"));
        Actions move = new Actions(driver);
        move.dragAndDropBy(one, -100, 0).perform();
        System.out.println("Slided to 40");

            WebElement drop = driver.findElement(By.xpath("//*[@id=\"mySelect\"]"));
            Select select1 = new Select(drop);
            select1.selectByVisibleText("Set to 100%");
            System.out.println("The Final Choice Selected");

            WebElement r2 = driver.findElement(By.xpath("//*[@id=\"radioButton2\"]"));
            r2.click();

            WebElement r1 = driver.findElement(By.xpath("//*[@id=\"radioButton1\"]"));
            r1.click();

        WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"checkBox1\"]"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.xpath("//*[@id=\"checkBox2\"]"));
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"checkBox3\"]"));
        checkBox3.click();

        WebElement checkBox4 = driver.findElement(By.xpath("//*[@id=\"checkBox4\"]"));
        checkBox4.click();

        WebElement checkBox5 = driver.findElement(By.xpath("//*[@id=\"checkBox5\"]"));
        checkBox5.click();


        WebElement dragElement = driver.findElement(By.id("logo"));
        WebElement dropTarget = driver.findElement(By.id("drop2"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement,dropTarget).perform();


        /*    for (int i = 1; i <= 6; i++) {
                WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"checkBox" + i + "\"]"));
                if (checkBox.isEnabled()) {
                    checkBox.click();
                }
                WebElement dragElement = driver.findElement(By.id("logo"));
                WebElement dropTarget = driver.findElement(By.id("drop2"));
                Actions actions = new Actions(driver);
                actions.dragAndDrop(dragElement,dropTarget).perform();

            }*/

           /* List<WebElement> checkboxes = driver.findElements(By.className("checkBoxClass"));
            checkboxes.get(0).click();*/

        driver.switchTo().frame("myFrame3");
        driver.findElement(By.cssSelector("#checkBox6")).click();
        driver.switchTo().defaultContent();


        driver.findElement(By.cssSelector("#myLink1")).click();
        driver.navigate().back();

        driver.findElement(By.cssSelector("#myLink2")).click();
        driver.navigate().back();

        driver.findElement(By.cssSelector("#myLink3")).click();
        driver.navigate().back();

        driver.findElement(By.cssSelector("#myLink4")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
/*Select dropDown = new Select(driver.findElement(By.id("myDropdown")));
            dropDown.selectByVisibleText("Link Three");*/
        /*WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"myDropdown\"]"));
        drop1.click();
        WebElement dselect1 = drop1.findElement(By.id("dropOption2"));
        dselect1.click();*/
////////////////////////////////////////////////////////////////////////////////////////////
            /*WebDriverWait wait;
            wait = new WebDriverWait()

            //WebElement drop1 = driver.findElement(By.xpath("//*[@id=\"myDropdown\"]"));
            WebElement drop1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"myDropdown\"]")));
            drop1.click();
            WebElement dselect1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("dropOption2")));
            dselect1.click();*/


        /*Select select = new Select(drop1);
        select.selectByVisibleText("Link Two");
        drop1.click();
        System.out.println("The Second Choice Selected");
        Select select2 = new Select(drop1);
        select2.selectByVisibleText("Link Three");
        System.out.println("The Third Choice Selected");
        Select select3 = new Select(drop1);
        select3.se
        System.out.println("The First Choice Selected");*/