package TestCases;

import Pages.P01_HomePage;
import Pages.P03_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static TestCases.TC02_Registration.password;
import static TestCases.TC02_Registration.email;


public class TC03_Login extends Testbase{


    @Test(priority = 1, description = "login to the system with valid data")
    public void loginWithValidDate_P() {
        new P01_HomePage(driver).clickLoginTap();
        new P03_LoginPage(driver).inputEmail(email).inputPassword(password).clickLoginButton();
        Assert.assertTrue(new P01_HomePage(driver).logOutButtonAppear());
    }

}
