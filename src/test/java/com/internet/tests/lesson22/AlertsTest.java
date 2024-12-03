package com.internet.tests.lesson22;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson22.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJSAlertsPage();
    }

    @Test
    public void clickForJSAlertTest() {
        new AlertsPage(driver).jSAlert().verifyResult("You successfully clicked an alert");
    }

    @Test
    public void clickForJSConfirmPositiveTest() {
        new AlertsPage(driver).jsConfirm().verifyResult("Ok");
    }

    @Test
    public void clickForJSConfirmNegativeTest() {
        new AlertsPage(driver).jsConfirmNegative().verifyResult("Cancel");
    }

    @Test
    public void clickForJSPrompt() {
new AlertsPage(driver).jsPrompt("ddd").verifyMessage("ddd");
    }

}
