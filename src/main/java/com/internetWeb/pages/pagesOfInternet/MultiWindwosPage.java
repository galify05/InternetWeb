package com.internetWeb.pages.pagesOfInternet;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultiWindwosPage extends BasePage {

    public MultiWindwosPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement newWindow;

    public MultiWindwosPage getNewWindow(){
        click(newWindow);
        return this;
    }


    public MultiWindwosPage switchToNewWindow(int index) {
        getNewWindow();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }

    @FindBy (css = "h3")
    WebElement h3Text;


    public MultiWindwosPage verifynewTab(String text) {
        Assert.assertTrue(h3Text.getText().contains(text));
        return this;
    }
}
