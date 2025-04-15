package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

    public class baseTest {
    WebDriver baseDriver;

    @BeforeMethod
    public void beforeClass() {
        baseDriver = new ChromeDriver();
        baseDriver.manage().window().maximize();
        baseDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseDriver.get("https://practicesoftwaretesting.com/");
    }

    @AfterMethod
    public void afterMethod() {
        baseDriver.quit();
    }
    }

