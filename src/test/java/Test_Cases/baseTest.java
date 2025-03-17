package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class baseTest {
        WebDriver baseDriver = new ChromeDriver(); ;

        @BeforeTest
        public void before_Class(){

           // baseDriver.get("https://practicesoftwaretesting.com/");
            baseDriver.get("https://practicesoftwaretesting.com/auth/login");
        }
        @AfterClass
        public void after_Class(){
           baseDriver.quit();
      }


    }

