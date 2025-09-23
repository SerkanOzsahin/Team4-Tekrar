package Ibrahim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Wait(5);

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Qasim Seyidov");
        Wait(3);

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("labubu@gmail.com");
        Wait(3);

        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("Current adress");
        Wait(3);

        WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
        permanentAdress.sendKeys("Permanent Adress");
        Wait(3);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
        Wait(1);
    }

    public static void Wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
