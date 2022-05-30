package com.cucumber.springboot.steps.web;

import com.cucumber.springboot.context.AppContext;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.*;


public class WebTest {
    protected WebDriver driver;
    SoftAssertions softAssertions = new SoftAssertions();

    protected WebTest() {
        driver = AppContext.driver;
    }

    protected Boolean elementPresent(String xPath) {
        return driver.findElements(By.xpath(xPath)).size() > 0;
    }

    protected Boolean elementPresent(WebElement element) {

        try {
            element.isDisplayed();
            return true;

        } catch (NotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    protected void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}

