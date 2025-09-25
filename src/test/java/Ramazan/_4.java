package Ramazan;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _4 {
    public static void main(String[] args) {
        WebDriver driver = BaseDriver.driver("https://www.saucedemo.com/");

        String username = "problem_user";
        String password = "secret_sauce";
        String expectedText = "Swag Labs";

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        WebElement logoText = driver.findElement(By.cssSelector("div[class='login_logo']"));
        WebElement submitbtn = driver.findElement(By.cssSelector(".submit-button"));

        final String actualText = logoText.getText();

        Assert.assertEquals("İşlem başarısız", expectedText, actualText);

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitbtn.click();

        List<WebElement> urunFiyati = driver.findElements(By.cssSelector("div[class='pricebar']>div"));

        System.out.println("Ürün Adeti: " + urunFiyati.size());
        System.out.println("------------");

        double toplamFiyat = 0;

        for (WebElement FiyatElement : urunFiyati) {
            String fiyatStr = FiyatElement.getText().replace("$", "");
            double fiyat = Double.parseDouble(fiyatStr);
            System.out.println("Ürün Fiyatı: " + fiyat);
            toplamFiyat += fiyat;
        }

        System.out.println("---------------");
        System.out.println("Toplam Fiyat: " + toplamFiyat);
    }
}
