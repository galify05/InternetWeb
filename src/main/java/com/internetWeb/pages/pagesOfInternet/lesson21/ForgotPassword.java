package com.internetWeb.pages.pagesOfInternet.lesson21;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage {

    public ForgotPassword(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement inputEmail;

    public ForgotPassword enterEmail(String email) {
        type(inputEmail, email);
        return this;
    }

    @FindBy(id = "form_submit")
    WebElement retrrievePasswordButton;

    public void clickOnRetrievePassword() {
        click(retrrievePasswordButton);
    }

    @FindBy(xpath = "//h1[.='Internal Server Error']")
    WebElement serverErrorPage;

    public boolean isPasswordRef() {
        return serverErrorPage.isDisplayed();
    }

}
