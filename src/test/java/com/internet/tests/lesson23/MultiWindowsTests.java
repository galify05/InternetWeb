package com.internet.tests.lesson23;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson23.MultiWindwosPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiWindowsTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getMultiWindowsPage();
    }

    @Test
    public void newWindowsTest(){
        new MultiWindwosPage(driver).switchToNewWindow(1)
                .verifynewTab("New Window");
    }
}
