package com.demoqa.pages;

import com.demoqa.pages.BookStore.BookStorePage;
import com.base.BasePage;
import com.demoqa.pages.Forms.FormsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By bookStoreCard = By.xpath("//div[@id='root']//h5[text() = 'Book Store Application']");
    private By formsPageCard = By.xpath("//div[@id='root']//h5[text() = 'Forms']");


    public BookStorePage goToBookStore(){
        scrollToElementJS(bookStoreCard);
        delay(2000);
        click(bookStoreCard);
        return new BookStorePage();
    }

    public FormsPage goToForms(){
        scrollToElementJS(formsPageCard);
        delay(2000);
        click(formsPageCard);
        return new FormsPage();
    }

}

