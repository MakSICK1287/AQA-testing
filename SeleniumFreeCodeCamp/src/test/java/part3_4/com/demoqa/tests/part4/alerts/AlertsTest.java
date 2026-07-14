package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert(){
        var alertsPage = homePage.goToAFWPage().clickAlertsMenu();
        String expectedAlertText = "You clicked a button";
        alertsPage.clickAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText, "\n Actual and Expected Messages DO NOT Match \n");
        acceptAlert();
    }
}
