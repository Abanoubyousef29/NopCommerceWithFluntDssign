package Pages;

import Util.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class PageBase {

    // instructor
    // locators
    // action method


    public static void hoverToListOfElementAndSelectOne(WebDriver driver,String number , List<WebElement> categoriesTapList) throws InterruptedException {

        final int parentIndex;
        Actions actionMouse = new Actions(driver);

        if (number == "random") {
            // generate a random number based on the last number in the category list
            parentIndex = Utility.generateRandomNumberBasedOnMaxNumberList(categoriesTapList.size());
        } else {
            parentIndex = Integer.parseInt(number);
        }

        // generate a random parent category index
        WebElement parentCategory = categoriesTapList.get(parentIndex);
        actionMouse.moveToElement(parentCategory).perform();

        // check if the hovered element contains any subcategory
        if (parentCategory.findElements(By.tagName("li")).size() > 0) {

            // get the list of subcategories
            List<WebElement> categorySubList = parentCategory.findElements(By.tagName("li"));

            // generate a random subcategory index
            int subIndex = Utility.generateRandomNumberBasedOnMaxNumberList(categorySubList.size());
            WebElement subCategory = categorySubList.get(subIndex);
            subCategory.click();
        } else {
            // if no subcategory, click on the parent category
            parentCategory.click();
        }
    }

    static void hoverToElementByText(WebDriver driver, String elementName) throws InterruptedException {

        Actions actionMouse = new Actions(driver);

        // generate a random parent category index
        WebElement elementByText = driver.findElement(By.xpath("//*[contains(text(), '"+elementName+"')]"));

        actionMouse.moveToElement(elementByText).perform();
    }

    public static void hoverToElementByTextAndClick(WebDriver driver,String elementName) throws InterruptedException {

        Actions actionMouse = new Actions(driver);

        // generate a random parent category index
        WebElement elementByText = driver.findElement(By.xpath("//*[contains(text(), '"+elementName+"')]"));

        actionMouse.moveToElement(elementByText).click().perform();
    }

}
