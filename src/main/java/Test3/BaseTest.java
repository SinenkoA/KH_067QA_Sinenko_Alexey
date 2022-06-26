package Test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }

    @BeforeMethod
    public void openSite() {
        driver = new ChromeDriver();
        driver.get("https://www.foxtrot.com.ua/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeSite() {
        driver.quit();
    }
}