package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_LoginPage {

    WebDriver driver ;
    //Constructor
    public P03_LoginPage(WebDriver driver){
        this.driver=driver;
    }

    // Locators
    // Private : to make the element can be used only in this class
    // final : the value can not be changed
    private final By EMAIL_TEXT = By.id("Email");

    private final By PASSWORD_TEXT = By.xpath("//input[@id='Password']");

    private final By LOGIN_BUTTON = By.xpath("//button[text()='Log in']");

    private final By FORGOT_PASSWORD_BUTTON = By.xpath("//a[@href='/passwordrecovery']");


    // action method
    public P03_LoginPage inputEmail(String email){
        driver.findElement(this.EMAIL_TEXT).sendKeys(email);
        return this;
    }

    public P03_LoginPage inputPassword(String password){
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }

    public P03_LoginPage clickLoginButton(){
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }

    public P03_LoginPage clickForgetPassword(){
        driver.findElement(this.FORGOT_PASSWORD_BUTTON).click();
        return this;
    }

}
