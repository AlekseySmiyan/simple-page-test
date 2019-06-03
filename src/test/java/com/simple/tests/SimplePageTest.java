package com.simple.tests;

import com.simple.data.SimplePageData;
import com.simple.pages.SimplePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimplePageTest extends BaseTest {

    public SimplePage simplePage;
    public SimplePageData simplePageData;

    @BeforeTest
    public void setupTest() {
        driver = setDriver();
        simplePage = new SimplePage(driver);
        simplePageData = new SimplePageData();
        simplePage.goPage(simplePage.URL);
    }

    @Test
    public void simplePageH1Text() {
        String actualText = simplePage.getTextH1();
        String expectedText = simplePageData.getH1Text();
        Assert.assertEquals(actualText, expectedText);
    }

    @AfterTest
    public void tearDownTest() {
        closeDriver();
    }
}
