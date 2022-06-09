package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        //open Google
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //select the search field
        WebElement input = driver.findElement(By.xpath(" //input[@name='q']"));
        //enter the data
        input.sendKeys("rozetka ua");
        input.submit();
        //go to the first option as a result of the search
        driver.findElement(By.xpath(" //h3[@class='LC20lb MBeuO DKV0Md']")).click();
        //select the search field
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
        //confirm the request by clicking on the search button
        driver.findElement(By.xpath("//button [@class='button button_color_green button_size_" +
                "medium search-form__submit ng-star-inserted']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //go to the first option as a result of the search
        driver.findElement(By.xpath("//ul[@class='catalog-grid ng-star-inserted']/li[1]")).click();
        //Press the change photo button
        driver.findElement(By.xpath("//button [@class='simple-slider__control " +
                "simple-slider__control--next']")).click();
        //click on the buy button
        driver.findElement(By.xpath("//button [@class='buy-button button button--with-icon " +
                "button--green button--medium ng-star-inserted']")).click();
        //close the browser
        driver.quit();
    }

}
