import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Affan {
    public static void main(String[] args) {

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://demoqa.com/text-box");
        chromeDriver.manage().window().maximize();
        Wait(7);


        WebElement fullName = chromeDriver.findElement(By.id("userName"));
        Wait(3);
        fullName.sendKeys("Lando Norris");

        WebElement eMail = chromeDriver.findElement(By.id("userEmail"));
        Wait(3);
        eMail.sendKeys("LandoNorris@gmail.com");

        WebElement adres = chromeDriver.findElement(By.id("currentAddress"));
        Wait(5);
        adres.sendKeys("London united kingdom  005743 bringthon sellit 43 ");

        WebElement daimiadres = chromeDriver.findElement(By.id("permanentAddress"));
        Wait(6);
        daimiadres.sendKeys("London united kingdom  005743 bringthon sellit 43  kelly 654");

        WebElement submitButton = chromeDriver.findElement(By.id("submit"));
        Wait(5);
        submitButton.click();


    }

    public static void Wait(int saniye){
        try {
            Thread.sleep(saniye*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


