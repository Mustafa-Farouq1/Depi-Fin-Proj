package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class baseTest {
        WebDriver baseDriver ;
        WebDriverWait wait ;

        @BeforeClass
        public void before_Class(){
            baseDriver  = new ChromeDriver();
           wait = new WebDriverWait(baseDriver, Duration.ofSeconds(10));
           baseDriver.get("https://practicesoftwaretesting.com/");

        }

        @AfterClass
        public void after_Class() {
                baseDriver.quit();

        }
    }

