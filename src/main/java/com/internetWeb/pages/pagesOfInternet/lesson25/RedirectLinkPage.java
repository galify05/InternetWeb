package com.internetWeb.pages.pagesOfInternet.lesson25;

import com.internetWeb.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class RedirectLinkPage extends BasePage {

    public RedirectLinkPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a")
    List<WebElement> allLinks;

    public RedirectLinkPage checkBrokenLinks() {
        for (int i = 0; i < allLinks.size(); i++) {
            WebElement element = allLinks.get(i);
            String url = element.getDomAttribute("href");
            verifyLinks(url);
        }
        return this;
    }

    @FindBy(id = "redirect")
    WebElement redir;
    public RedirectLinkPage getRedirektLinks() {
    click(redir);
    return this;
    }


    //проверка ссылок
    public RedirectLinkPage checkAllLinks() {
        String url = "";
        System.out.println("Total links on the page: " + allLinks.size());
        Iterator<WebElement> iterator = allLinks.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
            System.out.println("*******************************************");
        }
        return this;
    }
}
