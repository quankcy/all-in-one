package org.example.selenium.webdriver.pageobjectpattern;

// Generated by Selenium IDE

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.selenium.webdriver.pageobjectpattern.module.MainMenuPageObjectModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class PageObjectPatternTestScenario {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeAll
    public static void beforeAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
//        BrowserWebDriverContainer<?> chrome = new BrowserWebDriverContainer<>().withCapabilities(new ChromeOptions());
//        RemoteWebDriver driver = new RemoteWebDriver(chrome.getSeleniumAddress(), new ChromeOptions());
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void fIRSTTEST() {
        driver.get("http://gastro-tech.net/");
        driver.manage().window().setSize(new Dimension(1436, 864));

        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1)); // document -> ready

        /* IMPLICITY WAIT - Luzne wyczekiwanie */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//        driver.findElement(By.cssSelector()); -> WebElement
//        driver.findElements();
        /**/

        /* EXPLICITY WAIT - Dokladnie wyczekiwanie */
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement webElementForClick = webDriverWait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3"))); // -> WebElement , List<WebElement>

        webElementForClick.click();
        /**/

        /* FLUENT WAIT - Plynne czekanie */
        Wait<WebDriver> wait_30_5 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

        Wait<WebDriver> wait_30_1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

        wait_30_5.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        /**/

        // NoSuchElementException - findElement()
        // StaleElementException - findElement()

        MainMenuPageObjectModel.clickHome(driver);
        MainMenuPageObjectModel.clickOFirmie(driver);
        MainMenuPageObjectModel.clickOferta(driver);
        MainMenuPageObjectModel.clickSerwis(driver);

        System.out.println();
    }
}

