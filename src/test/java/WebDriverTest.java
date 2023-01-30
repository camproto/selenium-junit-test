import io.github.bonigarcia.seljup.SeleniumJupiter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

// from https://bonigarcia.dev/webdrivermanager/#webdriver-builder
// TODO but not working
@ExtendWith(SeleniumJupiter.class)
public class WebDriverTest {

    WebDriver driver;

    @BeforeEach
    void setupDriver() {
//        System.setProperty("webdriver.firefox.driver", "/selenium/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("selenium/FirefoxPortableESR102/App/Firefox64/firefox.exe");
//        options.addArguments("-headless");
        WebDriverManager.firefoxdriver().capabilities(options).create();
    }

    @AfterEach
    void tearDown() {
//        driver.quit();
    }

    @Test
    @Disabled
    public void test() {
        driver.get("https://www.heise.de/");
        Assertions.assertEquals("heise online - IT-News, Nachrichten und Hintergründe", driver.getTitle());
    }
}
