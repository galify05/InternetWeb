package com.internetWeb.pages.pagesOfInternet.lesson26;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

@FindBy(tagName = "h3")
WebElement h3;


    public UploadingFilePage verifyUploadingImg(String text) {
        Assert.assertTrue(h3.getText().contains(text));
    return this;
    }
}
