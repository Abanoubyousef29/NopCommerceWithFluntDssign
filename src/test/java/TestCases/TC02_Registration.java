package TestCases;

import Pages.P01_HomePage;
import Pages.P02_RegistrationPage;
import Util.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_Registration extends Testbase{

    // define test data
    String gender = "Male";
    String firstName = "first name";
    String lastName = "last name";
    static String email ;// note : static value remaion the same till project ends
    static String password = "random";
    static String confirmPassword = "random";

    @Test(priority = 1, description = "register with valid data")
    public void registerWithValidData_P() {
        email =  Utility.generateRandomEmail();
        new P01_HomePage(driver).clickOnRegisterTap();
        new P02_RegistrationPage(driver)
                .checkGender(gender)
                .inputFirstName(firstName)
                .inputLastName(lastName)
                .inputEmail(email)
                .inputPassword(password)
                .inputConfirmPassword(confirmPassword)
                .clickOnRegisterButton();

        Assert.assertTrue(driver.findElement(By.tagName("body")).
                        getText().contains("Your registration completed"));
    }
}
