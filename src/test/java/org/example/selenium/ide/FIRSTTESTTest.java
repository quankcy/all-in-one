package org.example.selenium.ide;

// Generated by Selenium IDE

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class FIRSTTESTTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeAll
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<>();
  }

  @AfterAll
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void fIRSTTEST() {
    driver.get("https://www.wp.pl/");
    driver.manage().window().setSize(new Dimension(1436, 864));

    js.executeScript("window.scrollTo(0,198)");
    driver.findElement(By.cssSelector("#\\36 915881342809729-202 .w-full")).click();
  }
}