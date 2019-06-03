package com.simple.tests;

import com.simple.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    protected WebDriver setDriver() {
        System.setProperty("webdriver.chrome.driver", PropertiesReader.getProperties("path.chromedriver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    protected void closeDriver() {
        if(driver != null)
            driver.quit();
    }
}
