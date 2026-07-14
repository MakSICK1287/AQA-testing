package com.demoqa.pages.AlertsFramesWindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends AlertsFrameWindowPage{
    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModal(){
        scrollToElementJS(smallModalButton);
        click(smallModalButton);

    }

    public String getTextFromSmallModal(){
        return find(smallModalText).getText();
    }

    public void clickCloseButton(){
        click(closeButton);
    }
}
