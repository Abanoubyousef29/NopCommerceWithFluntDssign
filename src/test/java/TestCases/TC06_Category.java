package TestCases;

import Pages.P05_ProductPage;
import Pages.P06_Category;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06_Category extends Testbase {

    String randomTap = "random";
    String parentElementTextToFilterColor = "Apparel" ;
    String childElementTextToFilterColor = "Shoes" ;
    String parentElementTextToBuy = "Electronics" ;
    String childElementTextToBuy = "Cell phones" ;

    @Test(priority = 1, description = "Choose a random category")
    public void chooseRandomCategory_P() throws InterruptedException {
        new P06_Category(driver).hoverToCategoriesTapAndSelect(randomTap);
        Assert.assertTrue(new P06_Category(driver).categoryBodyContainer());

    }

}
