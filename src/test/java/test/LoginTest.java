package test;

import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin(){
        test = extent.createTest("valid login test");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        LoginPage loginPage = new LoginPage(driver);

//        test.log(Status.INFO, "Entering Username");
//        loginPage.enterUsername("testuser");

        test.log(Status.INFO, "Entering Username");
        loginPage.eneterUserName("Admin");

        test.log(Status.INFO, "Entering password");
        loginPage.enterPassword("admin123");

        test.log(Status.INFO, "click login button");
        loginPage.clickSubmitBtn();

        test.log(Status.PASS, "lOGIN SUCCESSFULL AND NAVIGATE HOME PAGE");



    }
}
