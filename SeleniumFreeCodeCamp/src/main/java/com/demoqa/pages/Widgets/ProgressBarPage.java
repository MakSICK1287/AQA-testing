package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage{

    private By startButton = By.id("startStopButton");
    private By progressBar = By.xpath("//div[@id='progressBar']//div[@aria-valuenow='100']");

    public String getProgressValue(){
        fluentWaitUntilVisible(15,progressBar);
        return getText(progressBar);
    }

    public void clickStartButton(){
        scrollToElementJS(startButton);
        click(startButton);
    }

}
