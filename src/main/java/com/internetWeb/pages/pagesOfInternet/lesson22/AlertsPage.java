package com.internetWeb.pages.pagesOfInternet.lesson22;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-child(1) button")
    WebElement alert;

    public AlertsPage jSAlert() {
        click(alert);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(css = "li:nth-child(2) button")
    WebElement confirm;

    public AlertsPage jsConfirm() {
        click(confirm);
        driver.switchTo().alert().accept();
        return this;
    }

    public AlertsPage jsConfirmNegative() {
        click(confirm);
        driver.switchTo().alert().dismiss();
        return this;
    }

    @FindBy(css = "li:nth-child(3) button")
    WebElement prompt;

    public AlertsPage jsPrompt(String text) {
        click(prompt);
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyMessage(String text) {
        if (text != null) {
            Assert.assertTrue(result.getText().contains(text));
        }
        return this;
    }

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
}
