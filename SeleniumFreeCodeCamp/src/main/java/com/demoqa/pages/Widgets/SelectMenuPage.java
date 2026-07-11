package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage{

    private By standardMultiSelect = By.id("cars");

    public void setStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect,text);
    }

    public void setStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelect);
        deSelectByValue(standardMultiSelect,value);
    }

    public List<String> getAllSelectedMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }

}
