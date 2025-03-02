import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataDr {
    private static WebDriver driver;

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {{"standard_user", "secret_sauce" }, {"problem_user", "secret_sauce" }};
    }
}
