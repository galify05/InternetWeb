package com.internet.tests.lesson24;

import com.internet.tests.TestBase;
import com.internetWeb.pages.HomePage;
import com.internetWeb.pages.pagesOfInternet.lesson24.DragAndDropPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDragAndDropPage();
    }

    @Test
    public void dragAndDropTest() {
        new DragAndDropPage(driver).dropIt().verify("B" , "A");
    }


//    @Test
//    public void dragAndDropByXY(){
//        new DragAndDropPage(driver).dropByXY(150).verify("B", "A");
//    }
}
