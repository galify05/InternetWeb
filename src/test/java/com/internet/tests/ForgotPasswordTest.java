package com.internet.tests;

import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.ForgotPassword;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForgotPassPage();
    }

    @Test
    public void forgotPasswordPositiveTest(){
        new ForgotPassword(driver).enterEmail("cheburek@gmail.com").clickOnRetrievePassword();
        new ForgotPassword(driver).isPasswordRef();
    }


}
