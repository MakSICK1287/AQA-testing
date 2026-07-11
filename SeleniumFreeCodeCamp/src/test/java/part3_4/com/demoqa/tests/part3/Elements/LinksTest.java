package part3_4.com.demoqa.tests.part3.Elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void LinkTest(){
        String httpCode = "400";
        String errorName = "Bad Request";
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains(httpCode) && actualResponse.contains(errorName),
                "Actual response("+ actualResponse + ") does not contain "+ httpCode +" and "+ errorName +" ");
        linksPage.clickHomeLink();
    }
}
