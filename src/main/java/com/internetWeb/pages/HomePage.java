package com.internetWeb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement welcomeToPage;

    public boolean getWelcomePage() {
        return welcomeToPage.isDisplayed();
    }

    @FindBy(css = "[href='/forgot_password']")
    WebElement forgotPassword;

    public void getForgotPassPage() {
        click(forgotPassword);
    }

}
