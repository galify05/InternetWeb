package com.internet.tests.lesson21;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import org.testng.annotations.Test;

public class IsHomePagePresent extends TestBase {

    @Test
    public void openHomePage(){
        new HomePage(driver).getWelcomePage();
    }
}
