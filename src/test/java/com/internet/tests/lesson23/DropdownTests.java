package com.internet.tests.lesson23;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson23.DropDownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdownPage();
    }

    @Test
    public void dropdowntest(){
       new DropDownPage(driver).getDropMenu(1).verifyOption("Option 1");
    }
}
