package com.demoqa.pages.Elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By registrationAgeField = By.id("age");
    private By registrationSubmitButton = By.id("submit");



    public String getAge(String email){
        return find(By.xpath("//td[text()='"+ email +"']/preceding-sibling::td[1]")).getText();
    }
    public void clickEdit(String email){
        By edit = By.xpath("//tr[td[text()='" + email +"']]//span[@title='Edit']//*[local-name()='svg']");
        click(edit);
    }

    public void setAge(String age){
        set(registrationAgeField,age);
    }

    public void clickSubmitButton(){
        click(registrationSubmitButton);
    }


}
