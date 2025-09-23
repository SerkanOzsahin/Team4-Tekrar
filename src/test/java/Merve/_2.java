package Merve;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2 {
    public static void main(String[] args) {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/text-box");
        chromeDriver.manage().window().maximize();
        Wait(3);

        WebElement fullName = chromeDriver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        Wait(3);
        fullName.sendKeys("Merve Çelebi");

        WebElement email = chromeDriver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        Wait(3);
        email.sendKeys("merve99celebi@gmail.com");

        WebElement currentAddress = chromeDriver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        Wait(3);
        currentAddress.sendKeys("Adana");

        WebElement permanentAddress = chromeDriver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div/textarea"));
        Wait(3);
        permanentAddress.sendKeys("Rize");

        WebElement submitButton = chromeDriver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']/button"));
        Wait(3);
        submitButton.click();

        String expectedText = "Merve Çelebi";
        WebElement textName = chromeDriver.findElement(By.xpath("//p[@id='name']"));
        String actualFN = textName.getText();
        System.out.println(actualFN);
        Assert.assertTrue(actualFN.contains(expectedText));

        String expectedText2 = "merve99celebi@gmail.com";
        WebElement textEmail = chromeDriver.findElement(By.xpath("//p[@id='email']"));
        String actualText2 = textEmail.getText();
        System.out.println(actualText2);
        Assert.assertTrue(actualText2.contains(expectedText2));

        String expectedText3 = "Adana";
        WebElement textCurrent = chromeDriver.findElement(By.xpath("//p[@id='currentAddress']"));
        String actualText3 = textCurrent.getText();
        System.out.println(actualText3);
        Assert.assertTrue(actualText3.contains(expectedText3));

        String expectedText4 = "Rize";
        WebElement textPermanent = chromeDriver.findElement(By.xpath("//p[@id='permanentAddress']"));
        String actualText4 = textPermanent.getText();
        System.out.println(actualText4);
        Assert.assertTrue(actualText4.contains(expectedText4));
    }

    public static void Wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
