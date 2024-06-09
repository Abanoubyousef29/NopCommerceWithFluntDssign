package Pages;

import Util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class P05_ProductPage {

    WebDriver driver;

    public P05_ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By RANDOM_COLOR_LIST = By.xpath("//li[@class='item color-item']");


    private final By RANDOM_PRODCUT_LIST = By.xpath("//div[@class='item-box']");


    private final By ADD_TO_CART_BUTTON = By.xpath("//div[@class='add-to-cart-panel']");


    private final By ADD_TO_WISH_LIST_BUTTON = By.xpath("//div[@class='add-to-wishlist']");


    private final By ADD_TO_COMPARE_PRODUCT_BUTTON = By.xpath("//div[@class='compare-products']");


    private final By ADD_TO_SHOPPING_CART_BUTTON = By.id ("topcartlink");


    public int colorFilterSize(){
        return driver.findElements(RANDOM_COLOR_LIST).size();
    }


    public P05_ProductPage selectRandomColorToFilter(int randomNumber){
        driver.findElements(RANDOM_COLOR_LIST).get(randomNumber).click();
        return this ;
    }

    public boolean randomFilterIsSelected(int randomNumber){
        return driver.findElements(RANDOM_COLOR_LIST).get(randomNumber).isEnabled();
    }

    public P05_ProductPage selectRandomProduct(){
        final int randomNumber = Utility.generateRandomNumberBasedOnMaxNumberList(driver.findElements(RANDOM_PRODCUT_LIST).size());
        driver.findElements(RANDOM_PRODCUT_LIST).get(randomNumber).click();
        return this ;
    }

    public P05_ProductPage clickOnAddToCartButton(){
        driver.findElement(ADD_TO_CART_BUTTON).click();
        return this;
    }

    public P05_ProductPage clickOnAddToWishlistButton(){
        driver.findElement(ADD_TO_WISH_LIST_BUTTON).click();
        return this;
    }

    public P05_ProductPage clickOnAddToCompareProductsButton(){
        driver.findElement(ADD_TO_COMPARE_PRODUCT_BUTTON).click();
        return this;
    }

    public P05_ProductPage clickOnShoppingCartButton(){
        driver.findElement(ADD_TO_SHOPPING_CART_BUTTON).click();
        return this;
    }
}
