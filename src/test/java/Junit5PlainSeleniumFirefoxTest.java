import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit5PlainSeleniumFirefoxTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver","selenium/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("selenium/FirefoxPortableESR102/App/Firefox64/firefox.exe");
//        options.addArguments("-headless");
        driver = new FirefoxDriver(options);
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
