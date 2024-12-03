package com.internetWeb.pages.pagesOfInternet.lesson22;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframe;


    public FramesPage listOfIframes() {
        System.out.println("Frames of page: " + iframe.size());
        return this;
    }

    @FindBy(id = "mce_0_ifr")
    WebElement iframe1;

    public FramesPage switchToFrame() {
        driver.switchTo().frame(iframe1);
        return this;
    }

    public void verifyIframeByText(String textFrame) {
        Assert.assertTrue(pElement.getText().contains(textFrame));
    }

    @FindBy(tagName = "p")
    WebElement pElement;

    public FramesPage verifyIframeByP(String text){
        Assert.assertTrue(pElement.getText().contains(text));
        return this;
    }


//    @FindBy(tagName = "frame")
//    List<WebElement> frame;
//
//    public FramesPage listOfFrames() {
//        System.out.println("Frames of page: " + frame.size());
//        return this;
//    }
}





