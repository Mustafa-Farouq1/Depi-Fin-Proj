package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;

import java.time.Duration;


public class HomePage_TestCases extends baseTest {
    HomePage hp;

    @Test(priority = 1)
    public void NavBarNavigationTest() {
        hp = new HomePage(baseDriver);
        hp.NavBar(hp.get_Logo_btn(), hp.HomeURL, "Logo BTN");
        hp.NavBar(hp.get_Home_btn(), hp.HomeURL, "Home BTN");
        hp.NavBar(hp.get_Contact_btn(), hp.contactURL, "Contact BTN");
        hp.NavBar(hp.get_SignIn_btn(), hp.loginURL, "SignIn BTN");
        hp.NavBar(hp.get_PrivacyPolicy_btn(), hp.PrivacyPolicyURL, "Privacy Policy  BTN");

    }

    @Test
    public void CategoryNavBarTest() {
        hp = new HomePage(baseDriver);

        hp.NavBar(hp.get_Categories_btn(), hp.HomeURL, "Categories BTN");

        hp.NavBar(hp.get_Hand_tools_btn(), hp.handToolsURL, "Hand tools BTN");
        hp.Click_Categories_btn();

        hp.NavBar(hp.get_Power_tools_btn(), hp.powertToolURL, "Power tools BTN");
        hp.Click_Categories_btn();

        hp.NavBar(hp.get_Other_btn(), hp.otherURL, "Other BTN");
        hp.Click_Categories_btn();

        hp.NavBar(hp.get_Special_tools_btn(), hp.specialToolsURL, "Special tools BTN");
        hp.Click_Categories_btn();

        hp.NavBar(hp.get_Rentals_btn(), hp.rentalsURL, "Rentals BTN");
    }

    @Test
    public void LanguageNavBarTest() {
        hp = new HomePage(baseDriver);

        hp.NavBar(hp.get_Language_btn(), hp.HomeURL, "Language BTN");

        hp.NavBar(hp.get_DE_btn(), hp.HomeURL, "DE BTN");
        hp.textcheck("Einloggen");
        hp.Click_Language_btn();

        hp.NavBar(hp.get_EN_btn(), hp.HomeURL, "EN BTN");
        hp.textcheck("Sign in");
        hp.Click_Language_btn();

        hp.NavBar(hp.get_ES_btn(), hp.HomeURL, "ES BTN");
        hp.textcheck("Iniciar sesión");
        hp.Click_Language_btn();

        hp.NavBar(hp.get_FR_btn(), hp.HomeURL, "FR BTN");
        hp.textcheck("Se connecter");
        hp.Click_Language_btn();

        hp.NavBar(hp.get_NL_btn(), hp.HomeURL, "NL BTN");
        hp.textcheck("Inloggen");
        hp.Click_Language_btn();

        hp.NavBar(hp.get_TR_btn(), hp.HomeURL, "TR BTN");
        hp.textcheck("Giriş Yap");

    }

    @Test
    public void SortTest() {
        hp = new HomePage(baseDriver);
        Select sortDropdown = new Select(hp.get_Sort());
        sortDropdown.selectByVisibleText("Price (High - Low)");
        hp.checkPricesSorted("high");
        sortDropdown.selectByVisibleText("Price (Low - High)");
        hp.checkPricesSorted("low");
        sortDropdown.selectByVisibleText("Name (A - Z)");
        hp.checkNameSorted("asc");
        sortDropdown.selectByVisibleText("Name (Z - A)");
        hp.checkNameSorted("des");
        sortDropdown.selectByVisibleText("");
    }

    @Test
    public void PriceRangeTest() {
        hp = new HomePage(baseDriver);
        hp.moveSlidersAndCheckPrices(68, 100);
        hp.moveSlidersAndCheckPrices(-30, -140);
        hp.moveSlidersAndCheckPrices(-40, -180);
    }

    @Test
    public void CategoryFilterTest() {
        hp = new HomePage(baseDriver);
        hp.get_Search_Field().sendKeys("Marwan Magdy");

        hp.filterByCategory("Hammer", hp.get_Hammer());
        hp.verifyFirstProductBrandIs("Hammer", hp.BrandType);

        hp.filterByCategory("Hand Saw", hp.get_HandSaw());
        hp.verifyFirstProductBrandIs("Hand Saw", hp.BrandType);

        hp.filterByCategory("Wrench", hp.get_Wrench());
        hp.verifyFirstProductBrandIs("Wrench", hp.BrandType);

        hp.filterByCategory("Screwdriver", hp.get_Screwdriver());
        hp.verifyFirstProductBrandIs("Screwdriver", hp.BrandType);

        hp.filterByCategory("Pliers", hp.get_Pliers());
        hp.verifyFirstProductBrandIs("Pliers", hp.BrandType);

        hp.filterByCategory("Chisels", hp.get_Chisels());
        hp.verifyFirstProductBrandIs("Chisels", hp.BrandType);

        hp.filterByCategory("Measures", hp.get_Measures());
        hp.verifyFirstProductBrandIs("Measures", hp.BrandType);

        hp.filterByCategory("Grinder", hp.get_Grinder());
        hp.verifyFirstProductBrandIs("Grinder", hp.BrandType);

        hp.filterByCategory("Sander", hp.get_Sander());
        hp.verifyFirstProductBrandIs("Sander", hp.BrandType);

        hp.filterByCategory("Saw", hp.get_Saw());
        hp.verifyFirstProductBrandIs("Saw", hp.BrandType);

        hp.filterByCategory("Drill", hp.get_Drill());
        hp.verifyFirstProductBrandIs("Drill", hp.BrandType);

        hp.filterByCategory("Tool Belts", hp.get_ToolBelts());
        hp.verifyFirstProductBrandIs("Tool Belts", hp.BrandType);

        hp.filterByCategory("Storage Solutions", hp.get_StorageSolutions());
        hp.verifyFirstProductBrandIs("Storage Solutions", hp.BrandType);

        hp.filterByCategory("Workbench", hp.get_Workbench());
        hp.verifyFirstProductBrandIs("Workbench", hp.BrandType);

        hp.filterByCategory("Safety Gear", hp.get_SafetyGear());
        hp.verifyFirstProductBrandIs("Safety Gear", hp.BrandType);

        hp.filterByCategory("Fasteners", hp.get_Fasteners());
        hp.verifyFirstProductBrandIs("Fasteners", hp.BrandType);

        hp.filterByCategory("Hand Tools", hp.get_Hand_tools_list());
        hp.Click_Hand_tools_list();

        hp.filterByCategory("Power Tools", hp.get_Power_tools_list());
        hp.Click_Power_tools_list();

        hp.filterByCategory("Other", hp.get_Other_list());
        hp.Click_Other_list();
    }

    @Test
    public void BrandFilterTest() {
        hp = new HomePage(baseDriver);

        hp.Click_ForgeFlex_Tools();
        hp.verifyFirstProductBrandIs("ForgeFlex Tools", hp.brandname);

        hp.Click_MightyCraft_Hardware();
        hp.verifyFirstProductBrandIs("MightyCraft Hardware", hp.brandname);

    }

    @Test(priority = 2)
    public void SearchTest() {
        hp = new HomePage(baseDriver);
        hp.Search("Hammer");
        hp.Search("Pliers");
        hp.Search("Plierhewthrs");
        hp.resetSearch("Hammer");
        hp.resetSearch("Pliers");
        hp.resetSearch("Plierhewthrs");

    }

    @Test
    public void NavigateThroughPages() {
        hp = new HomePage(baseDriver);
        hp.Click_OneBTN();
        hp.Click_TwoBTN();
        hp.Click_ThreeBTN();
        hp.Click_FourBTN();
        hp.Click_FiveBTN();
        hp.Click_BackBTN();
        hp.Click_FrontBTN();
    }

    public void verifyFirst() {
        WebDriverWait wait = new WebDriverWait(baseDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]")));
        baseDriver.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]")).click();

    }

    @Test
    public void Navigate() {
        hp = new HomePage(baseDriver);

        verifyFirst();
    }

}
