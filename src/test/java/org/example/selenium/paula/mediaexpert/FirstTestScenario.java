package org.example.selenium.paula.mediaexpert;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class FirstTestScenario {

    @Test
    public void open_30_procent_rabatu_on_mainPage() {
        WebDriverSetup webDriverSetup = new WebDriverSetup();
        WebDriver driver = webDriverSetup.getWebDriver();
        Wait<WebDriver> fluentWait30_5 = new DriverWait(driver).getFluentWait30_5();

        driver.get("http://www.mediaexpert.pl/");
        driver.manage().window().fullscreen();

//        driver.wait(1000);
        WebElement webElement = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onetrust-accept-btn-handler")));
        webElement.click();

        MainPage mainPage = new MainPage();
        mainPage.click1stCarouselProduct(fluentWait30_5);

        driver.quit();

    }

    @Test
    public void open_TV_Audio_i_RTV_on_MainMenu() {
        WebDriverSetup webDriverSetup = new WebDriverSetup();
        WebDriver driver = webDriverSetup.getWebDriver();
        Wait<WebDriver> fluentWait30_5 = new DriverWait(driver).getFluentWait30_5();

        driver.get("http://www.mediaexpert.pl/");
        driver.manage().window().fullscreen();

//        driver.wait(1000);
        WebElement webElement = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onetrust-accept-btn-handler")));
        webElement.click();

        WebElement buttonTVAudioIRTVOnMainMenu = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#section_menu-list li:nth-of-type(1) > a")));
        buttonTVAudioIRTVOnMainMenu.click();
        //driver.findElement(By.cssSelector("#section_menu-list:nth-of-type(1)")).click();
        driver.quit();
    }

    @Test
    public void input_Samsung_TV_on_search_input() {

        WebDriverSetup webDriverSetup = new WebDriverSetup();
        WebDriver driver = webDriverSetup.getWebDriver();
        Wait<WebDriver> fluentWait30_5 = new DriverWait(driver).getFluentWait30_5();

        driver.get("http://www.mediaexpert.pl/");
        driver.manage().window().fullscreen();

//        driver.wait(1000);
        WebElement webElement = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onetrust-accept-btn-handler")));
        webElement.click();

        WebElement searchInput = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("header.header-desktop div.search-content > form.search-input .input-inner")));
        searchInput.sendKeys("Samsung TV");

        WebElement searchInputButton = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("header.header-desktop button [class='icon icon-search01']")));
        searchInputButton.click();

        driver.quit();
    }

    @Test
    public void going_to_AGD_and_choose_Lodowki_i_Zamrazarki() {
        WebDriverSetup webDriverSetup = new WebDriverSetup();
        WebDriver driver = webDriverSetup.getWebDriver();
        Wait<WebDriver> fluentWait30_5 = new DriverWait(driver).getFluentWait30_5();

        driver.get("http://www.mediaexpert.pl/");
        driver.manage().window().fullscreen();

//        driver.wait(1000);
        WebElement webElement = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onetrust-accept-btn-handler")));
        webElement.click();

        WebElement buttonAGDOnMainMenu = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#section_menu-list li:nth-of-type(2) > a")));
        buttonAGDOnMainMenu.click();

        WebElement buttonLodowki = fluentWait30_5.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row' and .//*[text()='Lodówki, zamrażarki i akcesoria']]//div[@class='tiles']//a[@href='/agd/lodowki-i-zamrazarki/lodowki']")));
        buttonLodowki.click();

        driver.quit();

    }


}
