package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement input = driver.findElement(By.xpath(" //input[@name='q']"));
        input.sendKeys("rozetka ua");
        input.submit();
        WebElement element = driver.findElement(By.xpath(" //h3[@class='LC20lb MBeuO DKV0Md']"));
        element.click();
        input = driver.findElement(By.xpath("//input[@name='search']"));
        input.sendKeys("iphone");
        input.submit();
        element = driver.findElement(By.xpath("//ul[@class='catalog-grid ng-star-inserted']/li[1]"));
        element.click();
        element = driver.findElement(By.xpath("//app-buy-button[@goods_id='260862296']"));
        element.click();
        driver.quit();
    }

}
