package part2.com.saucedemo.test.Login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_notsouce");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

}
