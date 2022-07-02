package sharedCapibilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AcceptInsecureCertsTest {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();

        options.setAcceptInsecureCerts(true);

        WebDriver driver  = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");

        driver.close();
    }
}
