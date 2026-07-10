package part3_4.com.demoqa.tests.part3.Forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickMaleRadioButton();
        formsPage.clickFemaleRadioButton();
        formsPage.clickOtherRadioButton();
        boolean isOtherRadioBtnSelected = formsPage.isOtherRadiobuttonSelected();
        Assert.assertTrue(isOtherRadioBtnSelected, "Other Radio Button is NOT selected");
    }
}
