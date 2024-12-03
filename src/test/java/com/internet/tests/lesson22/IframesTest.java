package com.internet.tests.lesson22;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson22.FramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFramesPage();
        new HomePage(driver).getIframe();
    }

    @Test
    public void iframeTest(){
       new FramesPage(driver).listOfIframes();
    }

    @Test
    public void switchToFrame(){
        new FramesPage(driver)
                .switchToFrame()
                .verifyIframeByText("Your content goes here.");
    }
}
