package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;
@Test
public class AlertsTest extends BaseTest {

    public void testInformationAlert(){
        var alertsPage = homePage.goToAFWPage().clickAlertsMenu();
        String expectedAlertText = "You clicked a button";
        alertsPage.clickAlertButton();
        Assert.assertEquals(getAlertText(),expectedAlertText, "\n Actual and Expected Messages DO NOT Match \n");
        acceptAlert();
    }
    public void testConfirmationAlert(){
        var alertsPage = homePage.goToAFWPage().clickAlertsMenu();
        alertsPage.clickConfirmButton();
        dismissAlert();
        String actualResult = alertsPage.getConfirmText();
        Assert.assertTrue(actualResult.contains("Cancel"), "Actual Result Does NOT Contain 'Cancel'");
    }
    public void testPromptAlert(){
        String name = "Max";
        var alertsPage = homePage.goToAFWPage().clickAlertsMenu();
        alertsPage.clickPromptButton();
        setAlertText(name);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        Assert.assertTrue(actualResult.contains(name));
    }
}
