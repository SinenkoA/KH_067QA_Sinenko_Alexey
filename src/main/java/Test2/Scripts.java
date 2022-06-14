package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Scripts {
    static void runScript1() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //open Rozetka
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        //go to the catalog
        driver.findElement(By.xpath("//button [@id='fat-menu']")).click();
        //select the monitors
        driver.findElement(By.xpath("//a [contains(@href,'monitors/c80089/')]")).click();
        //select the seller "Rozetka"
        driver.findElement(By.xpath("//a [@data-id='Rozetka']")).click();
        //go to the first option as a result of the search
        WebElement element = driver.findElement(By.xpath("//li[contains(@class,'catalog-grid__cell')][1]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    static void runScript2() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //open Apple
        driver.get("https://www.apple.com/");
        driver.manage().window().maximize();
        //select macbook
        driver.findElement(By.xpath("// li [contains(@class,'mac')]")).click();
        //select macbook pro
        driver.findElement(By.xpath("//li[contains(@class,'macbook-pro')]")).click();
        //select macbook pro 14 and 16
        driver.findElement(By.xpath("//li[contains(@class,'macbook-pro-14-and-16')]")).click();
        //click on the button Buy
        driver.findElement(By.xpath("//a[contains(@href,'buy_mac')]")).click();
        //click on the button "SELECT"
        WebElement element = driver.findElement(By.xpath("//button[contains(@data-autom," +
                "'proceed-14inch-best')]"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        //click on the button "Add to Bag"
        driver.findElement(By.xpath("//button[contains(@data-autom,'addToCart')]")).click();
    }

}
