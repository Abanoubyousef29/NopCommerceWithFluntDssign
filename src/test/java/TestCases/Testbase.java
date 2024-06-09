package TestCases;

import drivers.DriverFactory;
import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class Testbase {

    static protected WebDriver driver;

    @BeforeTest()
    @Parameters("browserName")
    public void openHomePage(@Optional("defaultBrowser") String browserName) {
        driver = DriverFactory.getNewInstance(browserName);
        DriverHolder.setDriver(driver);

        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void closeDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}