package org.example.selenium.paula.mediaexpert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetup {

    private WebDriver webDriver;

    public WebDriverSetup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        this.webDriver = new ChromeDriver(chromeOptions);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
