package com.demoqa.pages.Elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private By dynamicPropertiesItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");

    public WebTablesPage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        click(dynamicPropertiesItem);
        return new DynamicPropertiesPage();
    }
}
