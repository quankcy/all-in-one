package org.example.selenium.paula.mediaexpert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class MainPage {

    private final Function<Integer, By> carouselProduct = i -> By.cssSelector(".banners-before-recommendations .slides div.spark-slide:nth-child(" + i + ")");

    public void click1stCarouselProduct(Wait<WebDriver> fluentWait){
        clickCarouselProduct(fluentWait,1);
    }

    public void clickCarouselProduct(Wait<WebDriver> fluentWait, int productNumber){
        By carouselProductWithProductNumber = carouselProduct.apply(productNumber);
        fluentWait.until(ExpectedConditions.elementToBeClickable(carouselProductWithProductNumber)).click();
    }

}
