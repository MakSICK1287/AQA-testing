package part3_4.com.demoqa.tests.part4.waits;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualButtonText = dynamicPage.getVisibleAfterButtonText();
        String expectedButtonText = "Visible After 5 Seconds";
        Assert.assertEquals(actualButtonText,expectedButtonText,"\n Actual Abd Expected Texts Do NOT Match \n");
    }
}
