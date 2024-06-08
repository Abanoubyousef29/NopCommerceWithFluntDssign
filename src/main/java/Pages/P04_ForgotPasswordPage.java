package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_ForgotPasswordPage {

    WebDriver driver;

    public P04_ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By EMAIL_RESET_FIELD = By.id ("Email");

    private final By REVOCER_BUTTON = By.xpath("//button[text()='Recover']");


    public P04_ForgotPasswordPage inputRecoverEmail(String recoverEmail){
        driver.findElement(this.EMAIL_RESET_FIELD).sendKeys(recoverEmail);
        return this;
    }

    public P04_ForgotPasswordPage clickOnRecoverButton(){
        driver.findElement(this.REVOCER_BUTTON).click();
        return this;
    }
}
