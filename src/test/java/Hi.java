import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hi {
WebDriver driver = new ChromeDriver();
@Test
public void hi(){
}
@BeforeClass
public void setup(){
driver.get("https://seleniumbase.io/demo_page");
}
}
