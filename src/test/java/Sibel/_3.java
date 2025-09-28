package Sibel;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * bilgileri siteden alıp girin
 * yukarıda swag labs yazısının gözüktüğünü doğrulayın
 * tek bir döngü ile
 * 6 ürünün fiyatını önce yazdırın
 * fiyatlardaki dolar işaretinden kurtulun
 * sonra bunları toplayıp ekrana yazdırın
 */
public class _3 {
    public static void main(String[] args) {

        WebDriver driver= BaseDriver.driver("https://www.saucedemo.com/");
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        _1.Wait(2);
        username.sendKeys("visual_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        _1.Wait(3);
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        _1.Wait(3);
        loginButton.click();

        WebElement text = driver.findElement(By.xpath(("//div[@class='app_logo']")));
        wait.until(ExpectedConditions.visibilityOf(text));
        String actualText = text.getText();
        String expectedText = "Swag Labs";
        Assert.assertTrue(expectedText.contains(actualText));

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        double total = 0;
        for (WebElement price : prices) {
            String priceListWithout$ = price.getText().replace("$", "");
            System.out.println(priceListWithout$);
            double priceList = Double.parseDouble(priceListWithout$);
            total += priceList;
        }
        System.out.println("Total:" + total);
        _1.Wait(3);
        driver.quit();
    }
}
