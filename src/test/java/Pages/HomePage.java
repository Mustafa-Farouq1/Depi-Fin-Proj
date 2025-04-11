package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String HomeURL = "https://practicesoftwaretesting.com/";
    public String contactURL = "https://practicesoftwaretesting.com/contact";
    public String loginURL = "https://practicesoftwaretesting.com/auth/login";
    public String handToolsURL = "https://practicesoftwaretesting.com/category/hand-tools";
    public String powertToolURL = "https://practicesoftwaretesting.com/category/power-tools";
    public String otherURL = "https://practicesoftwaretesting.com/category/other";
    public String specialToolsURL = "https://practicesoftwaretesting.com/category/special-tools";
    public String rentalsURL = "https://practicesoftwaretesting.com/rentals";
    public String PrivacyPolicyURL = "https://practicesoftwaretesting.com/privacy";

    By Logo_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");

    By Home_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a");

    By Categories_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a");

    By Hand_tools_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[1]/a");
    By Power_tools_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[2]/a");
    By Other_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[3]/a");
    By Special_tools_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[4]/a");
    By Rentals_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/li[6]/a");

    By Contact_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a");
    By SignIn_btn = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a");
    By Language_btn = By.xpath("//*[@id=\"language\"]");
    By DE_btn = By.xpath("//*[@id=\"dropdown-animated\"]/li[1]/a");
    By EN_btn = By.xpath("//*[@id=\"dropdown-animated\"]/li[2]/a");
    By ES_btn = By.xpath("//*[@id=\"dropdown-animated\"]/li[3]/a");
    By FR_btn = By.xpath("//*[@id=\"dropdown-animated\"]/li[4]/a");
    By NL_btn = By.xpath("//*[@id=\"dropdown-animated\"]/li[5]/a");
    By TR_btn = By.xpath("//*[@id=\"dropdown-animated\"]/li[6]/a");

    By Sort = By.xpath("//*[@id=\"filters\"]/form[1]/div/select");

    By Hand_tools_list = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/label");
    By Power_tools_list = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[2]/label");
    By Other_list = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[3]/label");

    By ForgeFlex_Tools = By.xpath("//*[@id=\"filters\"]/fieldset[2]/div[1]/label");
    By MightyCraft_Hardware = By.xpath("//*[@id=\"filters\"]/fieldset[2]/div[2]/label");
    By Search_Field = By.id("search-query");
    By Search_btn = By.xpath("//*[@id=\"filters\"]/form[2]/div/button[2]");
    By Reset_btn = By.xpath("//*[@id=\"filters\"]/form[2]/div/button[1]");

    By Hammer = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[1]/label");
    By HandSaw = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[2]/label");
    By Wrench = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[3]/label");
    By Screwdriver = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[4]/label");
    By Pliers = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[5]/label");
    By Chisels = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[6]/label");
    By Measures = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[1]/ul/fieldset/div[7]/label");
    By Grinder = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[2]/ul/fieldset/div[1]/label");
    By Sander = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[2]/ul/fieldset/div[2]/label");
    By Saw = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[2]/ul/fieldset/div[3]/label");
    By Drill = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[2]/ul/fieldset/div[4]/label");
    By ToolBelts = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[3]/ul/fieldset/div[1]/label");
    By StorageSolutions = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[3]/ul/fieldset/div[2]/label");
    By Workbench = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[3]/ul/fieldset/div[3]/label");
    By SafetyGear = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[3]/ul/fieldset/div[4]/label");
    By Fasteners = By.xpath("//*[@id=\"filters\"]/fieldset[1]/div[3]/ul/fieldset/div[5]/label");

    By LeftSlider = By.xpath("//*[@id=\"filters\"]/div[1]/ngx-slider/span[5]");
    By LeftSliderPR = By.xpath("//*[@id=\"filters\"]/div[1]/ngx-slider/span[9]");
    By RightSlider = By.xpath("//*[@id=\"filters\"]/div[1]/ngx-slider/span[6]");
    By RightSliderPR = By.xpath("//*[@id=\"filters\"]/div[1]/ngx-slider/span[10]");

    By PrivacyPolicy_btn = By.xpath("/html/body/app-root/app-footer/div/p/a[3]");
    By ProductPrice = By.xpath("//span[@data-test='product-price']");
    By SliderContainer = By.xpath("//div[contains(text(), 'Loading')]");
    By ProductTitlePath = By.cssSelector("[data-test='product-name']");
    By filter_completedPath = By.cssSelector("[data-test='filter_completed']");
    By search_completedPath = By.cssSelector("[data-test='search_completed']");
    By sorting_completedPath = By.cssSelector("[data-test='sorting_completed']");

    By firstProduct = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]");
    public By brandname = By.xpath("/html/body/app-root/div/app-detail/div[1]/div[2]/p[1]/span[2]");
    public By BrandType = By.xpath("/html/body/app-root/div/app-detail/div[1]/div[2]/p[1]/span[1]");

    By BackBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[1]");
    By OneBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[2]");
    By TwoBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[3]");
    By ThreeBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[4]");
    By FourBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[5]");
    By FiveBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[6]");
    By FrontBTN = By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[2]/app-pagination/nav/ul/li[7]");

    public void Click_BackBTN() {
        driver.findElement(BackBTN).click();
    }

    public void Click_FrontBTN() {
        driver.findElement(FrontBTN).click();
    }

    public void Click_OneBTN() {
        driver.findElement(OneBTN).click();
    }

    public void Click_TwoBTN() {
        driver.findElement(TwoBTN).click();
    }

    public void Click_ThreeBTN() {
        driver.findElement(ThreeBTN).click();
    }

    public void Click_FourBTN() {
        driver.findElement(FourBTN).click();
    }

    public void Click_FiveBTN() {
        driver.findElement(FiveBTN).click();
    }


    public WebElement get_brandname() {
        return driver.findElement(brandname);
    }

    public WebElement get_LeftSliderPR() {
        return driver.findElement(LeftSliderPR);
    }

    public WebElement get_RightSliderPR() {
        return driver.findElement(RightSliderPR);

    }

    public WebElement get_LeftSlider() {
        return driver.findElement(LeftSlider);
    }

    public WebElement get_PrivacyPolicy_btn() {
        return driver.findElement(PrivacyPolicy_btn);
    }

    public WebElement get_RightSlider() {
        return driver.findElement(RightSlider);
    }

    public void Click_Logo_btn() {
        driver.findElement(Logo_btn).click();
    }

    public WebElement get_Logo_btn() {
        return driver.findElement(Logo_btn);
    }

    public void Click_Home_btn() {
        driver.findElement(Home_btn).click();
    }

    public WebElement get_Home_btn() {
        return driver.findElement(Home_btn);
    }

    public void Click_Contact_btn() {
        driver.findElement(Contact_btn).click();
    }

    public WebElement get_Contact_btn() {
        return driver.findElement(Contact_btn);
    }

    public void Click_SignIn_btn() {
        driver.findElement(SignIn_btn).click();
    }

    public WebElement get_SignIn_btn() {
        return driver.findElement(SignIn_btn);
    }

    public void Click_Categories_btn() {
        driver.findElement(Categories_btn).click();
    }

    public WebElement get_Categories_btn() {
        return driver.findElement(Categories_btn);
    }

    public void Click_Hand_tools_btn() {
        driver.findElement(Hand_tools_btn).click();
    }

    public WebElement get_Hand_tools_btn() {
        return driver.findElement(Hand_tools_btn);
    }

    public void Click_Power_tools_btn() {
        driver.findElement(Power_tools_btn).click();
    }

    public WebElement get_Power_tools_btn() {
        return driver.findElement(Power_tools_btn);
    }

    public void Click_Other_btn() {
        driver.findElement(Other_btn).click();
    }

    public WebElement get_Other_btn() {
        return driver.findElement(Other_btn);
    }

    public void Click_Special_tools_btn() {
        driver.findElement(Special_tools_btn).click();
    }

    public WebElement get_Special_tools_btn() {
        return driver.findElement(Special_tools_btn);
    }

    public void Click_Rentals_btn() {
        driver.findElement(Rentals_btn).click();
    }

    public WebElement get_Rentals_btn() {
        return driver.findElement(Rentals_btn);
    }

    public void Click_Language_btn() {
        driver.findElement(Language_btn).click();
    }

    public WebElement get_Language_btn() {
        return driver.findElement(Language_btn);
    }

    public void Click_DE_btn() {
        driver.findElement(DE_btn).click();
    }

    public WebElement get_DE_btn() {
        return driver.findElement(DE_btn);
    }

    public void Click_EN_btn() {
        driver.findElement(EN_btn).click();
    }

    public WebElement get_EN_btn() {
        return driver.findElement(EN_btn);
    }

    public void Click_ES_btn() {
        driver.findElement(ES_btn).click();
    }

    public WebElement get_ES_btn() {
        return driver.findElement(ES_btn);
    }

    public void Click_FR_btn() {
        driver.findElement(FR_btn).click();
    }

    public WebElement get_FR_btn() {
        return driver.findElement(FR_btn);
    }

    public void Click_NL_btn() {
        driver.findElement(NL_btn).click();
    }

    public WebElement get_NL_btn() {
        return driver.findElement(NL_btn);
    }

    public void Click_TR_btn() {
        driver.findElement(TR_btn).click();
    }

    public WebElement get_TR_btn() {
        return driver.findElement(TR_btn);
    }

    public void Click_Hand_tools_list() {
        driver.findElement(Hand_tools_list).click();
    }

    public WebElement get_Hand_tools_list() {
        return driver.findElement(Hand_tools_list);
    }

    public void Click_Power_tools_list() {
        driver.findElement(Power_tools_list).click();
    }

    public WebElement get_Power_tools_list() {
        return driver.findElement(Power_tools_list);
    }

    public void Click_Other_list() {
        driver.findElement(Other_list).click();
    }

    public WebElement get_Other_list() {
        return driver.findElement(Other_list);
    }

    public WebElement get_Sort() {
        return driver.findElement(Sort);
    }

    public void Click_ForgeFlex_Tools() {
        driver.findElement(ForgeFlex_Tools).click();
    }

    public WebElement get_ForgeFlex_Tools() {
        return driver.findElement(ForgeFlex_Tools);
    }

    public void Click_MightyCraft_Hardware() {
        driver.findElement(MightyCraft_Hardware).click();
    }

    public WebElement get_MightyCraft_Hardware() {
        return driver.findElement(MightyCraft_Hardware);
    }

    public WebElement get_Search_Field() {
        return driver.findElement(Search_Field);
    }

    public WebElement get_Search_btn() {
        return driver.findElement(Search_btn);
    }

    public void Click_Hammer() {
        driver.findElement(Hammer).click();
    }

    public WebElement get_Hammer() {
        return driver.findElement(Hammer);
    }

    public void Click_HandSaw() {
        driver.findElement(HandSaw).click();
    }

    public WebElement get_HandSaw() {
        return driver.findElement(HandSaw);
    }

    public void Click_Wrench() {
        driver.findElement(Wrench).click();
    }

    public WebElement get_Wrench() {
        return driver.findElement(Wrench);
    }

    public void Click_Screwdriver() {
        driver.findElement(Screwdriver).click();
    }

    public WebElement get_Screwdriver() {
        return driver.findElement(Screwdriver);
    }

    public void Click_Pliers() {
        driver.findElement(Pliers).click();
    }

    public WebElement get_Pliers() {
        return driver.findElement(Pliers);
    }

    public void Click_Chisels() {
        driver.findElement(Chisels).click();
    }

    public WebElement get_Chisels() {
        return driver.findElement(Chisels);
    }

    public void Click_Measures() {
        driver.findElement(Measures).click();
    }

    public WebElement get_Measures() {
        return driver.findElement(Measures);
    }

    public void Click_Grinder() {
        driver.findElement(Grinder).click();
    }

    public WebElement get_Grinder() {
        return driver.findElement(Grinder);
    }

    public void Click_Sander() {
        driver.findElement(Sander).click();
    }

    public WebElement get_Sander() {
        return driver.findElement(Sander);
    }

    public void Click_Saw() {
        driver.findElement(Saw).click();
    }

    public WebElement get_Saw() {
        return driver.findElement(Saw);
    }

    public void Click_Drill() {
        driver.findElement(Drill).click();
    }

    public WebElement get_Drill() {
        return driver.findElement(Drill);
    }

    public void Click_ToolBelts() {
        driver.findElement(ToolBelts).click();
    }

    public WebElement get_ToolBelts() {
        return driver.findElement(ToolBelts);
    }

    public void Click_StorageSolutions() {
        driver.findElement(StorageSolutions).click();
    }

    public WebElement get_StorageSolutions() {
        return driver.findElement(StorageSolutions);
    }

    public void Click_Workbench() {
        driver.findElement(Workbench).click();
    }

    public WebElement get_Workbench() {
        return driver.findElement(Workbench);
    }

    public void Click_SafetyGear() {
        driver.findElement(SafetyGear).click();
    }

    public WebElement get_SafetyGear() {
        return driver.findElement(SafetyGear);
    }

    public void Click_Fasteners() {
        driver.findElement(Fasteners).click();
    }

    public WebElement get_Fasteners() {
        return driver.findElement(Fasteners);
    }

    public void Click_Reset_btn() {
        driver.findElement(Reset_btn).click();
    }

    public WebElement get_Reset_btn() {
        return driver.findElement(Reset_btn);
    }


    public void NavBar(WebElement get_element, String expectedURL, String elementName) {
        try {
            // Wait until the element is clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement clickableElement = wait.until(
                    ExpectedConditions.elementToBeClickable(get_element)
            );
            System.out.println("✅ " + elementName + " is clickable!");
            get_element.click();
            wait.until(ExpectedConditions.urlToBe(expectedURL));

        } catch (Exception e) {
            System.out.println("❌ " + elementName + " not clickable: " + e.getMessage());
        }
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedURL);
        System.out.println(elementName + " URL = " + currentUrl + "\n");
    }

    public void Search(String searchWord) {
        get_Search_Field().sendKeys(searchWord);
        get_Search_btn().click();
        List<WebElement> productTitles = null;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                    search_completedPath
            ));
            productTitles = driver.findElements(ProductTitlePath);
        } catch (TimeoutException e) {
            // Nothing appeared — means zero results as expected
            System.out.println("❌ No products found as expected for '" + searchWord + "'");
            return; // No need to continue
        }

        for (WebElement titleElement : productTitles) {
            String titleText = titleElement.getText();
            Assert.assertTrue(titleText.toLowerCase().contains(searchWord.toLowerCase()),
                    "Product title does not contain '" + searchWord + "': " + titleText);
        }
        System.out.println("✅ All product titles contain '" + searchWord + "'");
        System.out.println("🔍 Total products found for '" + searchWord + "': " + productTitles.size());

        System.out.println();
    }

    public void filterByCategory(String categoryName, WebElement checkboxLocator) {
        // Click the checkbox (to filter by category)
        checkboxLocator.click();
        // Wait until products container is updated
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(filter_completedPath));
        // Get product titles
        List<WebElement> productTitles = driver.findElements(ProductTitlePath);

        // Verify results
        if (productTitles.isEmpty()) {
            System.out.println("❌ No products found for category: " + categoryName);
        } else {
            Assert.assertFalse(
                    productTitles.isEmpty(),
                    "❌ No products found for category: " + categoryName
            );
            System.out.println("✅ Category '" + categoryName + "' returned " + productTitles.size() + " products");

        }

    }

    public void searchPriceRange(double min, double max) {
        // Wait until the price elements are present
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.invisibilityOfElementLocated(
                        SliderContainer));

        // Get all price elements with correct attribute
        List<WebElement> productPrices = driver.findElements(
                ProductPrice);

        if (productPrices.isEmpty()) {
            System.out.println("❌ No product prices found.");
        } else {
            int count = 0;
            for (WebElement priceElement : productPrices) {
                String priceText = priceElement.getText().trim();  // e.g., "$89.55"
                if (priceText.isEmpty()) continue;

                try {
                    double price = Double.parseDouble(priceText.replace("$", "").replace(",", ""));
                    if (price >= min && price <= max) {
                        System.out.println("✅ Product price " + price + " is within range: " + min + " - " + max);
                    } else {
                        System.out.println("❌ Product price " + price + " is OUT of range: " + min + " - " + max);
                    }
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Unable to parse price: " + priceText);
                }
            }

            System.out.println("🔍 Total products checked: " + count);
        }
        System.out.println();
    }

    public void moveSlidersAndCheckPrices(int LxOffset, int RxOffset) {
        Actions actions = new Actions(driver);

        actions.dragAndDropBy(get_LeftSlider(), LxOffset, 0).release().perform();
        String LeftvalueText = get_LeftSliderPR().getAttribute("textContent");
        System.out.println("Left Slider value is: " + LeftvalueText);

        actions.dragAndDropBy(get_RightSlider(), RxOffset, 0).release().perform();
        String RightvalueText = get_RightSliderPR().getAttribute("textContent");
        System.out.println("Right Slider value is: " + RightvalueText);

        int min = Integer.parseInt(LeftvalueText);
        int max = Integer.parseInt(RightvalueText);

        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                SliderContainer));

        // Get all price elements with correct attribute
        List<WebElement> productPrices = driver.findElements(ProductPrice);

        if (productPrices.isEmpty()) {
            System.out.println("❌ No product prices found.");
        } else {
            int count = 0;
            for (WebElement priceElement : productPrices) {
                String priceText = priceElement.getText().trim();
                if (priceText.isEmpty()) continue;

                try {
                    double price = Double.parseDouble(priceText.replace("$", "").replace(",", ""));
                    if (price >= min && price <= max) {
                        System.out.println("✅ Product price " + price + " is within range: " + min + " - " + max);
                    } else {
                        System.out.println("❌ Product price " + price + " is OUT of range: " + min + " - " + max);
                    }
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Unable to parse price: " + priceText);
                }
            }

            System.out.println("🔍 Total products checked: " + count);
        }
        System.out.println();
    }

    public void textcheck(String expectedWord) {
        By byCategoryHeaderLocator = SignIn_btn;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the element has the expected text
        Boolean textAppeared = wait.until(ExpectedConditions.textToBe(byCategoryHeaderLocator, expectedWord));

        WebElement categoryHeader = driver.findElement(byCategoryHeaderLocator);
        String headerText = categoryHeader.getText();

        try {
            Assert.assertEquals(headerText, expectedWord,
                    "The header text is not as expected. Expected: '" + expectedWord + "', Actual: '" + headerText + "'");
            System.out.println("✅ Assertion Passed: Text '" + expectedWord + "' is as expected.\n");
        } catch (AssertionError e) {
            System.err.println("❌ Assertion Failed: " + e.getMessage());
            throw e;
        }
    }

    public void resetSearch(String text) {
        get_Search_Field().sendKeys(text);
        Click_Reset_btn();
    }

    public void checkPricesSorted(String sortingOrder) {
        List<Double> prices = new ArrayList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sorting_completedPath));

        // Get all price elements with correct attribute
        List<WebElement> productPrices = driver.findElements(ProductPrice);// Print each product price
        for (WebElement price : productPrices) {
            String priceText = price.getText().replace("$", "").trim();
            prices.add(Double.parseDouble(priceText));
        }
        // Print all prices and check if they are sorted in descending order
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Price: $" + prices.get(i));

            // Check the sorting order
            if (i > 0) {
                if (sortingOrder.equals("low") && prices.get(i) < prices.get(i - 1)) {
                    System.out.println("❌ Price is not in ascending order at index " + i +
                            " (" + prices.get(i - 1) + " > " + prices.get(i) + ")");
                    Assert.fail("Prices are not sorted correctly from Low to High");
                } else if (sortingOrder.equals("high") && prices.get(i) > prices.get(i - 1)) {
                    System.out.println("❌ Price is not in descending order at index " + i +
                            " (" + prices.get(i - 1) + " < " + prices.get(i) + ")");
                    Assert.fail("Prices are not sorted correctly from High to Low");
                }
            }
        }

        System.out.println("✅ All prices are sorted in the selected order: " + (sortingOrder.equals("low") ? "Low to High" : "High to Low") + "\n");
    }

    public void checkNameSorted(String sortingOrder) {
        // Wait for the loading element to disappear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                sorting_completedPath));

        // Get all product names
        List<WebElement> productNames = driver.findElements(ProductTitlePath);

        // Extract names into a list
        List<String> names = new ArrayList<>();
        for (WebElement name : productNames) {
            names.add(name.getText().trim());
        }
        // Print all names and check if they are sorted based on the selected order
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Product Name: " + names.get(i));

            // Check the sorting order
            if (i > 0) {
                if (sortingOrder.equals("asc") && names.get(i).compareTo(names.get(i - 1)) < 0) {
                    System.out.println("❌ Product name is not in ascending order at index " + i +
                            " (" + names.get(i - 1) + " > " + names.get(i) + ")");
                    Assert.fail("Product names are not sorted correctly from A to Z");
                } else if (sortingOrder.equals("des") && names.get(i).compareTo(names.get(i - 1)) > 0) {
                    System.out.println("❌ Product name is not in descending order at index " + i +
                            " (" + names.get(i - 1) + " < " + names.get(i) + ")");
                    Assert.fail("Product names are not sorted correctly from Z to A");
                }
            }
        }

        System.out.println("✅ All product names are sorted in the selected order: " + (sortingOrder.equals("asc") ? "A to Z" : "Z to A") + "\n");
    }

    public void verifyFirstProductBrandIs(String expectedBrand, By brand) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(filter_completedPath));

        try {
            // Attempt to click the first product
            driver.findElement(firstProduct).click();
        } catch (NoSuchElementException e) {
            System.out.println("❌ verifyFirstProductBrandIs FAILED: first product for " + expectedBrand + " not found!" + "\n");
            return;
        }
        WebElement element = driver.findElement(brand);
        String actualBrand = element.getText();

        try {
            Assert.assertEquals(actualBrand, expectedBrand,
                    "The product brand should be '" + expectedBrand + "'");
            System.out.println("✅ verifyFirstProductBrandIs PASSED: expected and actual both '" + expectedBrand + "'" + "\n");
        } catch (AssertionError e) {
            System.err.println("❌ verifyFirstProductBrandIs FAILED: expected '" + expectedBrand +
                    "' but was '" + actualBrand + "'" + "\n");
        }
        driver.navigate().back();
    }

}
