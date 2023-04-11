import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit5PlainSeleniumChromeTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "selenium/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("selenium/GoogleChromePortable/App/Chrome-bin/chrome.exe");
//        options.addArguments("-headless");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testTitle() {
        driver.get("https://www.heise.de/");
        Assertions.assertEquals("heise online - IT-News, Nachrichten und Hintergründe", driver.getTitle());
        FluentWait<WebDriver> wait = new WebDriverWait(driver, 10L);
        // not found, why?
//        wait.until(presenceOfElementLocated(By.id("notice")));
    }
}
