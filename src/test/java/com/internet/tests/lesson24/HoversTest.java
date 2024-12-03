package com.internet.tests.lesson24;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson24.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHeversPage();
    }

    @Test
    public void hoverTest(){
        new HoversPage(driver).showMeHover()
                .verifyHovers("user2");
    }
}
