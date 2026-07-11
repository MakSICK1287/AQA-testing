package part3_4.com.demoqa.tests.part3.Widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DatePickerTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2034";
        var datePickerPage = homePage.goToWidgetsPage().clickDatePicker();
        datePickerPage.clickDatePickerInput();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();

        String expectedDate = monthNumber + "/" + day + "/" + year;


        Assert.assertEquals(actualDate,expectedDate,"\n Actual and Expected Dates DO NOT Match \n"
               + "\n Actual date: "+actualDate+" \n"
        + "Expected date: " +expectedDate+"\n");
    }
}
