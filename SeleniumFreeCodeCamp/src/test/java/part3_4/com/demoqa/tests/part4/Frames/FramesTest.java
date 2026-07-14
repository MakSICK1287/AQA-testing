package part3_4.com.demoqa.tests.part4.Frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.rmi.server.ExportException;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAFWPage().clickFramesMenu();
        String actualBigBoxText = framesPage.getTextInBigBox();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText,expectedBigBoxText,
                "\n Actual Text And Expected Text Do NOT Match \n");

        String actualHeaderText = framesPage.getHeaderText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,"Actual And Expected Headers Do NOT Match");

    }

    @Test
    public void testFramesSmallBox(){
        var framesPage = homePage.goToAFWPage().clickFramesMenu();
        String actualSmallBoxText = framesPage.getTextInSmallBox();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText,expectedBigBoxText,
                "\n Actual Text And Expected Text Do NOT Match \n");

        String actualHeaderText = framesPage.getHeaderText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText,"Actual And Expected Headers Do NOT Match");
    }
}

