package com.internetWeb.pages.pagesOfInternet.lesson25;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagePage extends BasePage {

    public BrokenImagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img")
    List<WebElement> images;

    public BrokenImagePage chekingImg() {
        System.out.println(images.size() + " - " + "images");
        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String imageURL = element.getAttribute("src");
            verifyLinks(imageURL);

            try {
                boolean imageDisplayed = (Boolean)
                        js.executeScript("return (typeof arguments[0].naturalWidth!=undefined && arguments[0].naturalWidth>0);", element);
                if (imageDisplayed) {
                    System.out.println("DISPLAYED - OK");
                } else {
                    System.out.println("DISPLAYED IS BROKEN");
                    System.out.println("===================");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }
        return this;
    }
}
