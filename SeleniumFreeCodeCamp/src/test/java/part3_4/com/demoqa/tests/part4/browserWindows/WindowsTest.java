package part3_4.com.demoqa.tests.part4.browserWindows;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL(){
        var windowsPage = homePage.goToAFWPage().clickBrowserWindowsMenu();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL,expectedURL,"Actual and Expected URL's Do NOT Match");
    }
}
