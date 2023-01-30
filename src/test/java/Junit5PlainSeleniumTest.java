import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Junit5PlainSeleniumTest {
    WebDriver driver;

    @BeforeEach
    public void setup() {
// in v4.8 nicht notwendig, wenn ff.exe       System.setProperty("webdriver.firefox.driver","/selenium/geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver","selenium/geckodriver.exe"); // 3.13.0 needs this property
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("selenium/FirefoxPortableESR102/App/Firefox64/firefox.exe");
//        options.addArguments("-headless");
        driver = new FirefoxDriver(options);
    }

    @AfterEach
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void testTitle() {
        driver.get("https://www.heise.de/");
        Assertions.assertEquals("heise online - IT-News, Nachrichten und Hintergründe",driver.getTitle());

    }
}
