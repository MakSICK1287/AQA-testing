package com.demoqa.pages.Forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {

    private By maleRadioButton = By.id("gender-radio-1");
    public void clickMaleRadioButton(){
        scrollToElementJS(maleRadioButton);
        clickJS(maleRadioButton);
    }public boolean isMaleRadiobuttonSelected(){
        return find(maleRadioButton).isSelected();
    }


    private By femaleRadioButton = By.id("gender-radio-2");
    public void clickFemaleRadioButton(){
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }public boolean isFemaleRadiobuttonSelected(){
        return find(femaleRadioButton).isSelected();
    }


    private By otherRadioButton = By.id("gender-radio-3");
    public void clickOtherRadioButton(){
        scrollToElementJS(otherRadioButton);
        clickJS(otherRadioButton);
    }public boolean isOtherRadiobuttonSelected(){
        return find(otherRadioButton).isSelected();
    }



    private By sportsCheckBox = By.id("hobbies-checkbox-1");
    public void clickSportsCheckBox(){
        if (!find(sportsCheckBox).isSelected()){
            scrollToElementJS(sportsCheckBox);
            clickJS(sportsCheckBox);
        }
    }
    public boolean isSportsCheckBoxSelected(){
        return find(sportsCheckBox).isSelected();
    }
    public void unClickSportsCheckBox(){
        if(find(sportsCheckBox).isSelected()) {
            scrollToElementJS(sportsCheckBox);
            clickJS(sportsCheckBox);
        }
    }


    private By readingCheckBox = By.id("hobbies-checkbox-2");
    public void clickReadingCheckBox(){
        if (!find(readingCheckBox).isSelected()){
            scrollToElementJS(readingCheckBox);
            clickJS(readingCheckBox);
        }
    }
    public boolean isReadingCheckBoxSelected(){
        return find(readingCheckBox).isSelected();
    }
    public void unClickReadingCheckBox(){
        if(find(readingCheckBox).isSelected()) {
            scrollToElementJS(readingCheckBox);
            clickJS(readingCheckBox);
        }
    }


    private By musicCheckbox = By.id("hobbies-checkbox-3");
    public void clickMusicCheckBox(){
        if (!find(musicCheckbox).isSelected()){
            scrollToElementJS(musicCheckbox);
            clickJS(musicCheckbox);
        }
    }
    public boolean isMusicCheckBoxSelected(){
        return find(musicCheckbox).isSelected();
    }
    public void unClickMusicCheckBox(){
        if(find(musicCheckbox).isSelected()) {
            scrollToElementJS(musicCheckbox);
            clickJS(musicCheckbox);
        }
    }

    private By submitButton = By.id("submit");
    public void clickSubmitButton(){
//        scrollToElementJS(submitButton);
        click(submitButton);
    }




}