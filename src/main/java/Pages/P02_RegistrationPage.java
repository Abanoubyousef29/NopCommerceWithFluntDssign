package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_RegistrationPage {

    WebDriver driver;

    public P02_RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By GENDER_CHECKBOX = By.xpath("//div[@id='gender']");

    private final By FIRST_NAME_TEXT = By.xpath("//input[@id='FirstName']");

    private final By LAST_NAME_TEXT = By.xpath("//input[@id='LastName']");

    private final By EMAIL_TEXT = By.xpath("//input[@id='Email']");

    private final By PASSWORD_TEXT = By.xpath("//input[@id='Password']");

    private final By CONFIRM_PASSWORD_TEXT = By.xpath("//input[@id='ConfirmPassword']");

    private final By REGISTER_BUTTON = By.xpath("//button[@id='register-button']");


    public P02_RegistrationPage checkGender(String gender) {
        if(gender=="Male"){
            this.driver.findElement(GENDER_CHECKBOX).findElement(By.cssSelector("input[value='M'")).click();
        } else if (gender=="Female") {
            this.driver.findElement(GENDER_CHECKBOX).findElement(By.cssSelector("input[value='F'")).click();
        }
        return this;
    }

    public P02_RegistrationPage inputFirstName(String firstName){
        driver.findElement(this.FIRST_NAME_TEXT).sendKeys(firstName);
        return this;
    }
    public P02_RegistrationPage inputLastName(String lastName){
        driver.findElement(this.LAST_NAME_TEXT).sendKeys(lastName);
        return this;
    }
    public P02_RegistrationPage inputEmail(String email){
        driver.findElement(this.EMAIL_TEXT).sendKeys(email);
        return this;
    }
    public P02_RegistrationPage inputPassword(String password){
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }
    public P02_RegistrationPage inputConfirmPassword(String confirmPassword){
        driver.findElement(this.CONFIRM_PASSWORD_TEXT).sendKeys(confirmPassword);
        return this;
    }
    public P02_RegistrationPage clickOnRegisterButton(){
        driver.findElement(this.REGISTER_BUTTON).click();
        return this;
    }

}
