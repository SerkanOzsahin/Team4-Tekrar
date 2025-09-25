package Affan;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2 {
    public static void main(String[] args) {
       final String expectedName = "Charles Leclerc";
       final String expectedEmail = "CharlesLeclerc@gmail.com";
       final String expectedAdres = "monaco seniuv 347398";
       final String expectedDaimiAdres = "monaco seniuv 3642887 blo";

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/text-box");
        chromeDriver.manage().window().maximize();
        Wait(3);

        WebElement fullName = chromeDriver.findElement(By.id("userName"));
        Wait(2);
        fullName.sendKeys("Charles Leclerc");

        WebElement eMail = chromeDriver.findElement(By.id("userEmail"));
        Wait(2);
        eMail.sendKeys("CharlesLeclerc@gmail.com");

        WebElement adres = chromeDriver.findElement(By.id("currentAddress"));
        Wait(2);
        adres.sendKeys("monaco seniuv 347398 ");

        WebElement daimiadres = chromeDriver.findElement(By.id("permanentAddress"));
        Wait(2);
        daimiadres.sendKeys("monaco seniuv 3642887 blo");

        WebElement submitButton = chromeDriver.findElement(By.id("submit"));
        Wait(2);
        submitButton.click();

        String actualName = chromeDriver.findElement(By.id("name")).getText();
        String actualEmail = chromeDriver.findElement(By.id("email")).getText();
        String actualAdres = chromeDriver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
        String actualDaimiAdres = chromeDriver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();

        Assert.assertEquals("İsim eşleşmedi!", "Name:" + expectedName, actualName);
        Assert.assertEquals("Email eşleşmedi!", "email" + expectedEmail, actualEmail);
        Assert.assertEquals("Current Address :" + expectedAdres, actualAdres);
        Assert.assertEquals("Permananet Address :" + expectedDaimiAdres, actualDaimiAdres);

        Assert.assertTrue(expectedAdres.contains(actualAdres));
        Assert.assertTrue(expectedName.contains(actualName));
        Assert.assertTrue(expectedEmail.contains(actualEmail));
        Assert.assertTrue(expectedDaimiAdres.contains(actualDaimiAdres));
    }

    public static void Wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
