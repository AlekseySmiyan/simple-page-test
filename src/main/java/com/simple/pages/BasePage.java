package com.simple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goPage(String url) {
        driver.get(url);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }
}
