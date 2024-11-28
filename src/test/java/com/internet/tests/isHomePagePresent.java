package com.internet.tests;

import com.internetWeb.pages.HomePage;
import org.testng.annotations.Test;

public class isHomePagePresent extends TestBase {

    @Test
    public void openHomePage(){
        new HomePage(driver).getWelcomePage();
    }
}
