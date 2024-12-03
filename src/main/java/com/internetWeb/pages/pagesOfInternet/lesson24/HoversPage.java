package com.internetWeb.pages.pagesOfInternet.lesson24;

import com.internetWeb.pages.BasePage;
import com.internetWeb.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class = 'figure'][2]")
    WebElement secondUser;

    public HoversPage showMeHover() {
        new Actions(driver).moveToElement(secondUser).perform();
        pause(1000);
        return this;
    }

    @FindBy(xpath = "//h5[contains(.,'user2')]")
    WebElement h5User2;

    public HoversPage verifyHovers(String user) {
        Assert.assertTrue(h5User2.getText().contains(user));
        return this;
    }
}
