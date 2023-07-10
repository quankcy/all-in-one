package org.example.selenium.webdriver.pageobjectpattern.module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class MainMenuPageObjectModel {

    private static final By MAIN_MENU_SELECTOR = By.cssSelector("#menu-menu-glowne");
    private static final By HOME_SELECTOR = By.cssSelector("li:nth-child(1)");
    private static final By O_FIRMIE_SELECTOR = By.cssSelector("li:nth-child(2)");
    private static final By OFERTA_SELECTOR = By.cssSelector("li:nth-child(3)");
    private static final By SERWIS_SELECTOR = By.cssSelector("li:nth-child(4)");

    public static void clickHome(WebDriver webDriver){
        webDriver.findElement(new ByChained(MAIN_MENU_SELECTOR, HOME_SELECTOR)).click();
    }

    public static void clickOFirmie(WebDriver webDriver){
        webDriver.findElement(new ByChained(MAIN_MENU_SELECTOR, O_FIRMIE_SELECTOR)).click();
    }

    public static void clickOferta(WebDriver webDriver){
        webDriver.findElement(new ByChained(MAIN_MENU_SELECTOR, OFERTA_SELECTOR)).click();
    }

    public static void clickSerwis(WebDriver webDriver){
        webDriver.findElement(new ByChained(MAIN_MENU_SELECTOR, SERWIS_SELECTOR)).click();
    }

}
