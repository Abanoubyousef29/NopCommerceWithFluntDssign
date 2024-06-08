package TestCases;

import Pages.P01_HomePage;
import Pages.P08_SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_Home extends Testbase {

    String productName = "laptop";
    String currency = "Euro";

    @Test(priority = 1, description = "log out button is clickable")
    public void clickOnLogOutButton_P() {
        new P01_HomePage(driver).clickOnLogOut();
    }

    @Test(priority = 2, description = "search for a product")
    public void searchForProduct_P() {
        new P01_HomePage(driver).fillSearchFieldWithProductName(productName).clickOnSearchButton();
        Assert.assertEquals(new P08_SearchPage(driver).searchBar(), productName);
    }

    @Test(priority = 3 , description = "switch between currencies")
    public void switchBetweenCurrencies_P() {
        new P01_HomePage(driver).clickOncurrencyDropDownList().selectFromCurrencyDropDownList(currency);
        Assert.assertEquals(new P01_HomePage(driver).getSelectedCurrency(),currency);
    }

}
