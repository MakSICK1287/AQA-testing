package com.demoqa.pages.Forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");
    public PracticeFormPage clickPracticeForm(){
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
