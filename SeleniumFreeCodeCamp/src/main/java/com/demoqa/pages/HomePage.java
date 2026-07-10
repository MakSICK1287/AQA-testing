package com.demoqa.pages;

import com.demoqa.pages.BookStore.BookStorePage;
import com.base.BasePage;
import com.demoqa.pages.Elements.ElementsPage;
import com.demoqa.pages.Forms.FormsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By bookStoreCard = By.xpath("//div[@id='root']//h5[text() = 'Book Store Application']");
    private By formsPageCard = By.xpath("//div[@id='root']//h5[text() = 'Forms']");
    private By elementsPageCard = By.xpath("//div[@id='root']//h5[text() = 'Elements']");


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

    public ElementsPage goToElements(){
        scrollToElementJS(elementsPageCard);
        delay(2000);
        click(elementsPageCard);
        return new ElementsPage();
    }

}

