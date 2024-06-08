package TestCases;

import Pages.P05_ProductPage;
import Pages.P06_Category;
import Util.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC05_Product extends Testbase {

    String parentElementTextToFilterColor = "Apparel" ;
    String childElementTextToFilterColor = "Shoes" ;
    String parentElementTextToBuy = "Electronics" ;
    String childElementTextToBuy = "Cell phones" ;

    static int randomNumber ;


    @Test(priority = 1, description = "filter by random color")
    public void filterByRandomColor_P() throws InterruptedException {
        new P06_Category(driver).hoverToAnElementByText(parentElementTextToFilterColor)
                .hoverToAnElementByTextAndClick(childElementTextToFilterColor);
        Thread.sleep(1500);
        randomNumber = Utility.generateRandomNumberBasedOnMaxNumberList(new P05_ProductPage(driver)
                .colorFilterSize());
        new P05_ProductPage(driver).selectRandomColorToFilter(randomNumber);
        Assert.assertTrue(new P05_ProductPage(driver).randomFilterIsSelected(randomNumber));
    }

    @Test(priority = 2, description = "add random product to cart")
    public void addRandomProductToCart_P() throws InterruptedException {
        new P06_Category(driver).hoverToAnElementByText(parentElementTextToBuy)
                .hoverToAnElementByTextAndClick(childElementTextToBuy);
        Thread.sleep(1000);
        new P05_ProductPage(driver).selectRandomProduct().clickOnAddToCartButton();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).
                getText().contains("The product has been added to your shopping cart"));
    }

    @Test(priority = 3, description = "add random product to whishlist")
    public void addRandomProductToWhishList_P() throws InterruptedException {
        new P06_Category(driver).hoverToAnElementByText(parentElementTextToBuy)
                .hoverToAnElementByTextAndClick(childElementTextToBuy);
        Thread.sleep(1000);
        new P05_ProductPage(driver).selectRandomProduct().clickOnAddToWishlistButton();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).
                getText().contains("The product has been added to your wishlist"));
    }

    @Test(priority = 4, description = "add random product to compare list")
    public void addRandomProductToCompareList_P() throws InterruptedException {
        new P06_Category(driver).hoverToAnElementByText(parentElementTextToBuy)
                .hoverToAnElementByTextAndClick(childElementTextToBuy);
        Thread.sleep(1000);
        new P05_ProductPage(driver).selectRandomProduct().clickOnAddToCompareProductsButton();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.tagName("body")).
                getText().contains("The product has been added to your product comparison"));
    }
}
