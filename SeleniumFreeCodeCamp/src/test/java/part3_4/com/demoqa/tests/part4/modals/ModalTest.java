package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog(){
        var modalPage = homePage.goToAFWPage().clickModalDialogMenu();
        modalPage.clickSmallModal();
        String actualText = modalPage.getTextFromSmallModal();
        Assert.assertTrue(actualText.contains("small modal"), "Message does NOT contain 'small modal' ");
        modalPage.clickCloseButton();
    }
}
