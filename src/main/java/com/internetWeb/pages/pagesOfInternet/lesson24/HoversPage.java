package com.internetWeb.pages.pagesOfInternet.lesson24;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class = 'figure'][2]")
    WebElement secondUser;

    public HoversPage showMeHover() {
        new Actions(driver).moveToElement(secondUser).perform();
        return this;
    }

    @FindBy(xpath = "//h5[contains(.,'user2')]")
    WebElement h5User2;

    public HoversPage verifyHovers(String user) {
        Assert.assertTrue(h5User2.getText().contains(user));
        return this;
    }
}
