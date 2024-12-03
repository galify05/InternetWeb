package com.internetWeb.pages.pagesOfInternet;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(tagName = "input")
    WebElement slider;

    public HorizontalSliderPage moveHorizontalSlider() {
        new Actions(driver).dragAndDropBy(slider,100,0).perform();
        return this;
    }

    @FindBy(id = "range")
    WebElement range;

    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertTrue(range.getText().contains(number));
    return this;
    }
}
