package com.internetWeb.pages.pagesOfInternet.lesson24;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement aSquare;

    @FindBy(id = "column-b")
    WebElement bSquare;

    public DragAndDropPage dropIt() {
        new Actions(driver).dragAndDrop(aSquare, bSquare).perform();
        return this;
    }

//    public DragAndDropPage dropByXY(int horizontal150) {
//        new Actions(driver).dragAndDropBy(aSquare, horizontal150, 0).perform();
//        return this;
//    }

    public DragAndDropPage verify(String textA, String textB) {
//        Assert.assertTrue(aSquare.getText().contains(textA));
        Assert.assertTrue(aSquare.getText().contains(textA) && bSquare.getText().contains(textB));
        return this;
    }
}
