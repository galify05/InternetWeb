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

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement alertsPage;

    public void getJSAlertsPage() {
        click(alertsPage);
    }

    @FindBy(css = "[href='/frames']")
    WebElement frames;

    public void getFramesPage() {
        click(frames);
    }

    @FindBy(css = "[href='/nested_frames']")
    WebElement nestedFrames;

    public void getNestedFrames() {
        click(nestedFrames);
    }

    @FindBy(css = "[href='/iframe']")
    WebElement iframe;

    public void getIframe() {
        click(iframe);
    }

    @FindBy(css = "[href='/windows']")
    WebElement windows;

    public void getMultiWindowsPage() {
        click(windows);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement dropdown;

    public void getDropdownPage() {
        click(dropdown);
    }

    @FindBy(css = "[href='/horizontal_slider']")
    WebElement slider;

    public void getSlider() {
        click(slider);
    }

    @FindBy(css = "[href='/drag_and_drop']")
    WebElement drag;

    public void getDragAndDropPage() {
        click(drag);
    }

    @FindBy(css = "[href='/hovers']")
    WebElement hover;

    public void getHeversPage() {
        click(hover);
    }
}
