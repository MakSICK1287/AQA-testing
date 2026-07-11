package com.demoqa.pages.Elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{

    private By badRequestLink = By.id("bad-request");
    private By linkResponse = By.id("linkResponse");
    private By homeLink = By.id("simpleLink");

    public void clickBadRequestLink(){
        click(badRequestLink);
    }

    public HomePage clickHomeLink(){
        scrollToElementJS(homeLink);
        click(homeLink);
        return new HomePage();
    }

    public String getResponse(){
        delay(2000);
        return find(linkResponse).getText();
    }
}
