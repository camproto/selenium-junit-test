package org.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","/selenium/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("selenium/FirefoxPortableESR102/App/Firefox64/firefox.exe");
        options.addArguments("-headless");
        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get("https://www.heise.de/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}