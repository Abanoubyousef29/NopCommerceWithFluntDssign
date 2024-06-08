package TestCases;

import drivers.DriverFactory;
import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Testbase {

    static protected WebDriver driver;

    @BeforeTest()
    @Parameters("browserName")
    public void openHomePage(@Optional("firefox") String browserName) {
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