package com.internetWeb.pages.pagesOfInternet.lesson26;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class UploadingFilePage extends BasePage {

    public UploadingFilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement uploadField;
    @FindBy(id = "file-submit")
    WebElement submitButton;

    public UploadingFilePage uploadImg(String path) {
        uploadField.sendKeys(path);
        click(submitButton);
        return this;
    }

    @FindBy(id = "file-upload")
    WebElement fileupload;

    public UploadingFilePage uploadTxt() {
        clickWithRectangle(fileupload, 3, 4);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        Dimension dimension = driver.manage().window().getSize();
        int x = dimension.getWidth() - 870;
        int y = dimension.getHeight() - 810; //820

        robot.mouseMove(x, y);
        pause(500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        pause(500);
        robot.keyPress(KeyEvent.VK_ENTER);

        click(submitButton);
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement h3;

    public UploadingFilePage verifyUploadingImg(String text) {
        Assert.assertTrue(h3.getText().contains(text));
        return this;
    }
}
