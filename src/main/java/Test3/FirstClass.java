package Test3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstClass extends BaseTest {
    @Test(groups = {"positive"})
    public void firstTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By searchField = By.xpath("//input[@type='search']");
        By productsTable = By.xpath("//div[@class='listing__body-wrap image-switch']");
        String query = "iPhone";
        driver.findElement(searchField).sendKeys(query);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(productsTable));
        List<WebElement> elementList = driver.findElements(productsTable);
        Assert.assertNotNull(elementList);
    }

    @Test(groups = {"negative"}, expectedExceptions = {RuntimeException.class})
    public void secondTest() {
        By searchField = By.xpath("//input[@type='search']");
        By productsTable = By.xpath("//div[@class='listing__body-wrap image-switch']");
        String query = "Глазковыколупыватель";
        driver.findElement(searchField).sendKeys(query);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        driver.findElement(productsTable);
    }

    @Test(groups = {"positive"})
    public void thirdTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By searchField = By.xpath("//input[@type='search']");
        By productsTable = By.xpath("//div[@class='listing__body-wrap image-switch']");
        By checkboxStock = By.xpath("//label[@for='sidebar-check-input-aktsii']");
        By buttonShow = By.xpath("//a[@class='listing__submit-apply']");
        String query = "iPhone";
        driver.findElement(searchField).sendKeys(query);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxStock));
        driver.findElement(checkboxStock).click();
        driver.findElement(buttonShow).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(productsTable));
        List<WebElement> elementList = driver.findElements(productsTable);
        Assert.assertNotNull(elementList);
    }

    @Test(groups = {"positive"})
    public void fourthTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        By searchField = By.xpath("//input[@type='search']");
        By firstProduct = By.xpath("//div[@class='listing__body-wrap image-switch']//div");
        By buttonBuy = By.xpath("//div[@class='button product-box__main-buy__button buy-button product-buy-button']");
        By basket = By.xpath("//div[@class='header-tooltip__cards smooth-scroll']");
        String query = "iPhone";
        driver.findElement(searchField).sendKeys(query);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));
        driver.findElement(firstProduct).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonBuy));
        driver.findElement(buttonBuy).click();
        List<WebElement> elementList = driver.findElements(basket);
        Assert.assertNotNull(elementList);
    }
}