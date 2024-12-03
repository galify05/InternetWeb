package com.internet.tests.lesson24;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getSlider();
    }

    @Test
    public void moveSlider(){
        new HorizontalSliderPage(driver).moveHorizontalSlider().verifySliderValue("5");
    }
}
