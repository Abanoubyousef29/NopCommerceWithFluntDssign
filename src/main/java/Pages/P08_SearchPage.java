package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_SearchPage {

    WebDriver driver;

    public P08_SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    private final By SEARCH_BAR_FIELD = By.xpath("//input[@id='q']");

    public String searchBar() {
        return driver.findElement(SEARCH_BAR_FIELD).getAttribute("value");
    }

}
