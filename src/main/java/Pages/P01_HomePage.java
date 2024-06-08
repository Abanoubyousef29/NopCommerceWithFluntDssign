package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_HomePage {

    WebDriver driver;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By LOGIN_TAP_BUTTON = By.xpath("//a[@href='/login?returnUrl=%2F']");

    private final By REGISTER_TAP_BUTTON = By.xpath("//a[@href='/register?returnUrl=%2F']");

    private final By SEARCH_FIELD = By.xpath("//input[@id='small-searchterms']");

    private final By SEARCH_BUTTON = By.xpath("//button[text()='Search']");

    private final By CURRENCY_DROP_DOWN_LIST = By.xpath("//select[@id='customerCurrency']");

    private final By LOGOUT_BUTTON = By.xpath("//div[@class='header-links'] // child :: li[2]");


    public P01_HomePage clickLoginTap() {
        driver.findElement(this.LOGIN_TAP_BUTTON).click();
        return this;
    }

    public P01_HomePage clickOnRegisterTap() {
        driver.findElement(this.REGISTER_TAP_BUTTON).click();
        return this;
    }

    public P01_HomePage clickOnLogOut() {
        driver.findElement(this.LOGOUT_BUTTON).click();
        return this;
    }

    public P01_HomePage fillSearchFieldWithProductName(String productName) {
        driver.findElement(this.SEARCH_FIELD).sendKeys(productName);
        return this;
    }

    public P01_HomePage clickOnSearchButton() {
        driver.findElement(this.SEARCH_BUTTON).click();
        return this;
    }

    public P01_HomePage clickOncurrencyDropDownList() {
        driver.findElement(this.CURRENCY_DROP_DOWN_LIST).click();
        return this;
    }

    public P01_HomePage selectFromCurrencyDropDownList(String currencySelect) {
        Select object = new Select(driver.findElement(this.CURRENCY_DROP_DOWN_LIST));
        object.selectByVisibleText(currencySelect);
        return this;
    }

    public String getSelectedCurrency() {
        Select object = new Select(driver.findElement(CURRENCY_DROP_DOWN_LIST));
        return object.getFirstSelectedOption().getText();
    }

    public boolean logOutButtonAppear(){
        return driver.findElement(LOGOUT_BUTTON).isDisplayed();
    }
}
