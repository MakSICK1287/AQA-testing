package part3_4.com.demoqa.tests.part3.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class ScrollSelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDowns() {
        var selectMenuPage = homePage.goToWidgetsPage().clickSelectMenu();
        String option1 = "Volvo";
        String option2 = "Audi";
        selectMenuPage.setStandardMulti(option1);
        selectMenuPage.setStandardMulti(1);
        selectMenuPage.setStandardMulti(option2);
        selectMenuPage.setStandardMulti(2);
        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedMultiOptions = selectMenuPage.getAllSelectedMultiOptions();
        Assert.assertTrue(actualSelectedMultiOptions.contains(option1) &&
                actualSelectedMultiOptions.contains(option2) &&
                actualSelectedMultiOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedMultiOptions.contains("Saab"));
    }
}
