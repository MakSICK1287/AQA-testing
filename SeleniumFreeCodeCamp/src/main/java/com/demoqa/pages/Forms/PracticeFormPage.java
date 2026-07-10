package com.demoqa.pages.Forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By maleRadioButton = By.id("gender-radio-1");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By otherRadioButton = By.id("gender-radio-3");

    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }
    public void clickMaleRadioButton(){
        scrollToElementJS(maleRadioButton);
        clickJS(maleRadioButton);
    }

    public void clickOtherRadioButton(){
        scrollToElementJS(otherRadioButton);
        clickJS(otherRadioButton);
    }

    public boolean isFemaleRadiobuttonSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public boolean isMaleRadiobuttonSelected(){
        return find(maleRadioButton).isSelected();
    }

    public boolean isOtherRadiobuttonSelected(){
        return find(otherRadioButton).isSelected();
    }
}
