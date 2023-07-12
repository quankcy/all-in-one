package org.example.selenium.paula.mediaexpert;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class DriverWait {

    private final Wait<WebDriver> fluentWait30_5;

    public DriverWait(WebDriver driver) {
        fluentWait30_5 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
    }

    public Wait<WebDriver> getFluentWait30_5() {
        return fluentWait30_5;
    }
}
