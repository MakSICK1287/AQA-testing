package part3_4.com.demoqa.tests.part3.Forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckBox()  {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.unClickSportsCheckBox();
        formsPage.unClickReadingCheckBox();
        formsPage.unClickMusicCheckBox();
        formsPage.clickSportsCheckBox();
        formsPage.clickReadingCheckBox();
        formsPage.clickMusicCheckBox();
        boolean isSportsCheckBoxSelected = formsPage.isSportsCheckBoxSelected();
        boolean isReadingCheckBoxSelected = formsPage.isReadingCheckBoxSelected();
        boolean isMusicCheckBoxSelected = formsPage.isMusicCheckBoxSelected();
        Assert.assertTrue(isSportsCheckBoxSelected, "Sports checkbox is NOT enabled");
        Assert.assertTrue(isReadingCheckBoxSelected,"Reading checkbox is NOT enabled");
        Assert.assertTrue(isMusicCheckBoxSelected,"Music checkbox is NOT enabled");
    }
}
