package com.demoqa.pages.AlertsFramesWindows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFrameWindowPage {

    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmButton = By.id("confirmButton");
    private By confirmResult = By.id("confirmResult");
    private By promtButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public void clickAlertButton(){
        click(alertButton);
    }

    public void clickTimerAlertButton(){
        click(timerAlertButton);
    }

    public void clickConfirmButton(){
        click(confirmButton);
    }

    public String getConfirmText(){
        return find(confirmResult).getText();
    }

    public void clickPromptButton(){
        click(promtButton);
    }

    public String getPromptAlertResult(){
        return find(promptResult).getText();
    }


}
