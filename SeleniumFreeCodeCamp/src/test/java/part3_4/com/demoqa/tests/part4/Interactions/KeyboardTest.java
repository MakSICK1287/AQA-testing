package part3_4.com.demoqa.tests.part4.Interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {
    @Test
    public void testApplicationUsingKeyboard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Pitalenko Maksim");
        textBoxPage.setEmail("pitalenkomaksim@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 3400");
        textBoxPage.setCurrentAddress("Minsk,Belarus");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3400"),
                "Actual Address Does NOT Contain 'Suite 3400'");
    }
}
