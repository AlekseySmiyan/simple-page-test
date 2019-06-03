package com.simple.pages;

import com.simple.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimplePage extends BasePage {

    public final String URL = PropertiesReader.getProperties("url.simple.page");

    public SimplePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#_ajyiaceg1")
    private WebElement textH1;

    public String getTextH1() {
        return getElementText(textH1);
    }
}
