package com.internet.tests.lesson26;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson26.UploadingFilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadTesting extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getUploadPage();
    }

    @Test
    public void uploadingFileTest(){
        new UploadingFilePage(driver).uploadImg("E:/Java/Tools/1.jpg")
                .verifyUploadingImg("File Uploaded!")
        ;
    }
}
