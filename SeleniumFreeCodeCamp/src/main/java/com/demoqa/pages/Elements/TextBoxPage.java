package com.demoqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage{

    private By userName = By.id("userName");
    private By currentAddress = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddresResult =By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress(){
        explicitWaitUntilVisible(5,currentAddresResult);
        return getText(currentAddresResult);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setFullName(String name){
        scrollToElementJS(userName);
        sendKeys(find(userName), Keys.chord(name));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB,email));
    }

    public void setCurrentAddress(String address){
        find(currentAddress).sendKeys(address + Keys.ENTER);
    }
}
