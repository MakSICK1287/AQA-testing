package com.demoqa.pages.AlertsFramesWindows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFrameWindowPage extends HomePage {
    private By modalDialogMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    public ModalDialogsPage clickModalDialogMenu(){
        scrollToElementJS(modalDialogMenuItem);
        click(modalDialogMenuItem);
        return new ModalDialogsPage();
    }

}
