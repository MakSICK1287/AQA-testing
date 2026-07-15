package part3_4.com.demoqa.tests.part4.Interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult(){
        var sliderPage = homePage.goToWidgetsPage().clickSliderMenu();
        int x = 180;
        int y = 0;
        sliderPage.moveSlider(x,y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "74";
        Assert.assertEquals(actualValue,expectedValue,"\n Actual And Expected Value Do NOT Match \n");

    }
}
