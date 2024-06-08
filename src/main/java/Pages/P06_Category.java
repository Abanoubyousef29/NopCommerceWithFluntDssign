package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Pages.PageBase.*;

public class P06_Category {

    WebDriver driver;

    public P06_Category(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    private final By CATEGORY_TAP_LIST = By.xpath("//ul[@class='top-menu notmobile']/li");

    private final By CATEGORY_Body_PAGE = By.xpath("//div[@class='page category-page']");

    public P06_Category hoverToCategoriesTapAndSelect(String tapNumber) throws InterruptedException {
        hoverToListOfElementAndSelectOne(driver, tapNumber, driver.findElements(this.CATEGORY_TAP_LIST));
        return this;
    }

    public P06_Category hoverToAnElementByText(String elementName) throws InterruptedException {
        Thread.sleep(1500);
        hoverToElementByText(driver, elementName);
        return this;
    }

    public P06_Category hoverToAnElementByTextAndClick(String elementName) throws InterruptedException {
        Thread.sleep(1500);
        hoverToElementByTextAndClick(driver, elementName);
        return this;
    }


    public boolean categoryBodyContainer() {
        return driver.findElement(CATEGORY_Body_PAGE).isDisplayed();
    }

}
