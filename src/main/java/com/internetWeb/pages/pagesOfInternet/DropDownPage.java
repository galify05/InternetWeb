package com.internetWeb.pages.pagesOfInternet;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage {

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

@FindBy(id = "dropdown")
    WebElement dropdown;

    public DropDownPage getDropMenu(int i) {
        Select select = new Select(dropdown);
select.selectByIndex(i);
    return this;
    }

    public DropDownPage verifyOption(String text){
                Assert.assertTrue((new Select(dropdown).getFirstSelectedOption().getText()).equals(text));
        return this;
    }
}
