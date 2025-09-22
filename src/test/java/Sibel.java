import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibel {
    public static void main(String[] args) {

        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://demoqa.com/text-box");
        chromeDriver.manage().window().maximize();
        Wait(10);

        WebElement fullName= chromeDriver.findElement(By.id("userName"));
        Wait(3);
        fullName.sendKeys("Sibel Cebeci");

        WebElement email=chromeDriver.findElement(By.id("userEmail"));
        Wait(3);
        email.sendKeys("leblebi@gmail.com");

        WebElement currentAddress= chromeDriver.findElement(By.id("currentAddress"));
        Wait(3);
        currentAddress.sendKeys("Konya");

        WebElement permanentAddress= chromeDriver.findElement(By.id("permanentAddress"));
        Wait(3);
        permanentAddress.sendKeys("Konya yolu");

        WebElement submitButton= chromeDriver.findElement(By.id("submit"));
        Wait(3);
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
