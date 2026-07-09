package com.demoqa.pages;

import com.demoqa.pages.Forms.BookStorePage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By bookStoreCard = By.xpath("//div[@id='root']//h5[text() = 'Book Store Application']");

    public BookStorePage goToBookStore(){
        scrollToElementJS(bookStoreCard);
        delay(2000);
        click(bookStoreCard);
        return new BookStorePage();
    }

}

