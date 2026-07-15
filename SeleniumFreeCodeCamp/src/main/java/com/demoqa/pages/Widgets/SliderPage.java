package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage{

    private By slider = By.id("slider");
    private By sliderValue = By.id("sliderValue");

    public String getSliderValue(){
        return getAttribute(sliderValue,"value");
    }

    public void moveSlider(int x, int y){
        dragAndDropBy(find(slider), x, y);
    }
}
