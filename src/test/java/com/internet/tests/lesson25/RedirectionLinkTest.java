package com.internet.tests.lesson25;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson25.RedirectLinkPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedirectionLinkTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getRedirektPage();
        new RedirectLinkPage(driver).getRedirektLinks();
    }

    @Test
    public void chekLinks(){
//        new RedirectLinkPage(driver).checkAllLinks();
        new RedirectLinkPage(driver).checkBrokenLinks();
    }
}
