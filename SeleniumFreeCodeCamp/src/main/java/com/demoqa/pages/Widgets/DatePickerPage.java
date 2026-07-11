package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class DatePickerPage extends WidgetsPage{

    private By datePickerInput = By.id("datePickerMonthYearInput");
    private By yearDropDown = By.className("react-datepicker__year-select");
    private By monthDropDown = By.cssSelector(".react-datepicker__month-select");

    private By dayValue(String day){
        return By.xpath(
                "//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDatePickerInput(){
        scrollToElementJS(datePickerInput);
        click(datePickerInput);
    }

    public String getDate(){
        return find(datePickerInput).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown,month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown,year);
    }

    public void clickDay(String day){
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }

}
