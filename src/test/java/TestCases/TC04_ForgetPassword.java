package TestCases;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import Pages.P04_ForgotPasswordPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static TestCases.TC02_Registration.email;

public class TC04_ForgetPassword extends Testbase {

    @Test(priority = 1, description = "forget password flow")
    public void resetPassword_P() throws InterruptedException {
        new P01_HomePage(driver).clickLoginTap();
        new P03_LoginPage(driver).clickForgetPassword();
        new P04_ForgotPasswordPage(driver).inputRecoverEmail(email).clickOnRecoverButton();

        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).
                getText().contains("Email with instructions has been sent to you."));

    }
}
