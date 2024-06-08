package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_ShoppingCartPage {

    WebDriver driver;

    public P07_ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By TERMS_OF_SERVICE_CHECKBOX = By.id("termsofservice");

    private final By CHECKOUT_BUTTON = By.id("checkout");


    public P07_ShoppingCartPage clickOnTermsOfServiceCheckbox(){
        driver.findElement(TERMS_OF_SERVICE_CHECKBOX).click();
        return this;
    }

    public P07_ShoppingCartPage clickOnCheckoutButton(){
        driver.findElement(CHECKOUT_BUTTON).click();
        return this;
    }
}
