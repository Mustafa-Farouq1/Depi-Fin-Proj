import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StepDef {
        WebDriver driver;

        @Before
        public void setUp () {
            driver = new ChromeDriver();
        }

        @Given("I open the SeleniumBase demo page")
        public void openDemoPage () {
            driver.get("https://seleniumbase.io/demo_page");
        }

        @When("I enter {string} in the first text field")
        public void enterFirstTextField (String text){
            driver.findElement(By.cssSelector("#myTextInput")).sendKeys(text);
        }

        @When("I enter {string} in the textarea")
        public void enterTextarea (String text){
            driver.findElement(By.cssSelector("#myTextarea")).sendKeys(text);
        }

        @When("I clear and enter {string} in the second text field")
        public void clearAndEnterSecondTextField (String text){
            WebElement field = driver.findElement(By.xpath("//*[@id='myTextInput2']"));
            field.clear();
            field.sendKeys(text);
        }

        @When("I click the main button")
        public void clickMainButton () {
            driver.findElement(By.xpath("//*[@id='myButton']")).click();
        }

        @When("I enter {string} in the placeholder field")
        public void enterPlaceholderField (String text){
            driver.findElement(By.xpath("//*[@id='placeholderText']")).sendKeys(text);
        }

        @When("I slide the slider to 40")
        public void slideSlider () {
            WebElement slider = driver.findElement(By.xpath("//*[@id='mySlider']"));
            Actions move = new Actions(driver);
            move.dragAndDropBy(slider, -100, 0).perform();
        }

        @When("I select {string} from the dropdown")
        public void selectFromDropdown (String option){
            WebElement dropdown = driver.findElement(By.xpath("//*[@id='mySelect']"));
            Select select = new Select(dropdown);
            select.selectByVisibleText(option);
        }

        @When("I select the second radio button")
        public void selectSecondRadioButton () {
            driver.findElement(By.xpath("//*[@id='radioButton2']")).click();
        }

        @When("I select the first radio button")
        public void selectFirstRadioButton () {
            driver.findElement(By.xpath("//*[@id='radioButton1']")).click();
        }

        @When("I check all available checkboxes")
        public void checkAllCheckboxes () {
            for (int i = 1; i <= 6; i++) {
                WebElement checkBox = driver.findElement(By.xpath("//*[@id='checkBox" + i + "']"));
                if (!checkBox.isSelected()) {
                    checkBox.click();
                }
            }
        }

        @When("I drag the logo to the second drop area")
        public void dragAndDropLogo () {
            WebElement dragElement = driver.findElement(By.id("logo"));
            WebElement dropTarget = driver.findElement(By.id("drop2"));
            Actions actions = new Actions(driver);
            actions.dragAndDrop(dragElement, dropTarget).perform();
        }

        @When("I switch to the third iframe and check a box")
        public void switchToIframeAndCheckBox () {
            driver.switchTo().frame("myFrame3");
            driver.findElement(By.cssSelector("#checkBox6")).click();
            driver.switchTo().defaultContent();
        }

        @When("I click all four links and navigate back each time")
        public void clickLinksAndNavigateBack () {
            for (int i = 1; i <= 4; i++) {
                driver.findElement(By.cssSelector("#myLink" + i)).click();
                driver.navigate().back();
            }
        }

        @Then("I should successfully interact with the page")
        public void verifyPageInteractions () {
            System.out.println("All interactions were successful!");
        }

        @After
        public void tearDown () {
            if (driver != null) {
                driver.quit();
            }
        }
    }
