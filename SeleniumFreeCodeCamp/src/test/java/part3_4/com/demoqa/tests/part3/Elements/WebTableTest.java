package part3_4.com.demoqa.tests.part3.Elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void changeAgeTest(){

        String email = "alden@example.com";
        String expectedAge = "34";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge(expectedAge);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getAge(email);
        Assert.assertEquals(actualAge,expectedAge,"Ages are NOT equal");
    }

}
