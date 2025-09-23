package Ramazan;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2 {
    public static void main(String[] args) {
        WebDriver driver = BaseDriver.driver("https://demoqa.com/text-box");
        Wait(3);

        WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullname.sendKeys("Ferdi Tayfur");
        Wait(3);

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        email.sendKeys("ferdibabaadanaa@gmail.com");
        Wait(3);

        WebElement currentAdress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdress.sendKeys("Karşı yaka mah.");
        Wait(3);

        WebElement permanentAdress = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div/textarea"));
        permanentAdress.sendKeys("Adana");
        Wait(3);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        Wait(3);

        String expectedTextname = "Ferdi Tayfur";
        WebElement actualname = driver.findElement(By.xpath("//p[@id='name']"));
        String actualFN = actualname.getText();
        System.out.println(actualFN);
        Assert.assertTrue(actualFN.contains(expectedTextname));

        String expectedTextEmail = "ferdibabaadanaa@gmail.com";
        WebElement actualemail = driver.findElement(By.xpath("//p[@id='email']"));
        String actualEM = actualemail.getText();
        System.out.println(actualEM);
        Assert.assertTrue(actualEM.contains(expectedTextEmail));

        String expectedTextCurrent = "Karşı yaka mah.";
        WebElement actualCurrent = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        String actualCA = actualCurrent.getText();
        System.out.println(actualCA);
        Assert.assertTrue(actualCA.contains(expectedTextCurrent));

        String expectedpermanent = "Adana";
        WebElement actualPermanent = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        String actualPA = actualPermanent.getText();
        System.out.println(actualPA);
        Assert.assertTrue(actualPA.contains(expectedpermanent));
    }

    public static void Wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
