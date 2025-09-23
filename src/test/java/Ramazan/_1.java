package Ramazan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        Wait(3);
        driver.manage().window().maximize();

        Wait(4);
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Hakkı Bulut");
        Wait(3);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("ahmetefe5531@gmail.com");
        Wait(3);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("İzmir yolu 3. kat ");
        Wait(5);

        WebElement permanentadress = driver.findElement(By.id("permanentAddress"));
        permanentadress.sendKeys("İzmir yolu 3. kat ");
        Wait(3);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
        Wait(3);
    }

    public static void Wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
