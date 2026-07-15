package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage{

    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText(){
        explicitWaitUntilVisible(5,visibleAfterButton);
        return find(visibleAfterButton).getText();
    }
}
