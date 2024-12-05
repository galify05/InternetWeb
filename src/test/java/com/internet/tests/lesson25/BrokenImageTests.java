package com.internet.tests.lesson25;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson25.BrokenImagePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImageTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getBrokenImagePage();
    }

    @Test
    public void chekImage() {
        new BrokenImagePage(driver).chekingImg();
    }
}
