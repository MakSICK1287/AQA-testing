package com.demoqa.pages.AlertsFramesWindows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;


public class FramesPage extends AlertsFrameWindowPage{
    private By textInBigBox = By.id("sampleHeading");
    private By headerText = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
    private String iFrameBigBox = "frame1";
    private By iFrameSmallBox =  By.xpath("//div[@id='frame2Wrapper']//iframe");


    private void switchToBigBox(){
        switchToFrameString(iFrameBigBox);
    }
    private void switchToSmallBox(){
//        switchToFrameIndex(1);
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigBox(){
        switchToBigBox();
        String text = find(textInBigBox).getText();
        switchToDefaultContent();
        return text;
    }

    public String getTextInSmallBox(){
        switchToSmallBox();
        String text = find(textInBigBox).getText();
        switchToDefaultContent();
        return text;
    }

    public String getHeaderText(){

        return find(headerText).getText();
    }
}
