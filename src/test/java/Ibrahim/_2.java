package Ibrahim;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Wait(4);

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Qasim Seyidov");
        Wait(3);

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        email.sendKeys("labubu@gmail.com");
        Wait(3);

        WebElement currentAdress = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdress.sendKeys("Current adress");
        Wait(3);

        WebElement permanentAdress = driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']/div/textarea"));
        permanentAdress.sendKeys("Permanent Adress");
        Wait(3);

        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
        submitBtn.click();

        String expectedFullName = "Qasim Seyidov";
        WebElement sentFullName = driver.findElement(By.xpath("//p[@id='name']"));
        String actualFullName = sentFullName.getText();
        System.out.println(actualFullName);
        Assert.assertTrue(actualFullName.contains(expectedFullName));

        String expectedEmail = "labubu@gmail.com";
        WebElement sentEmail = driver.findElement(By.xpath("//p[@id='email']"));
        String actualEmail = sentEmail.getText();
        System.out.println(actualEmail);
        Assert.assertTrue(actualEmail.contains(expectedEmail));

        String expectedCurrentAdress = "Current adress";
        WebElement sentCurrentAdress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        String actualCurrentAdress = sentCurrentAdress.getText();
        System.out.println(actualCurrentAdress);
        Assert.assertTrue(actualCurrentAdress.contains(expectedCurrentAdress));

        String expectedPermanentAdress = "Permanent Adress";
        WebElement sentPermanentAdress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        String actualPermanentAdress = sentPermanentAdress.getText();
        System.out.println(actualPermanentAdress);
        Assert.assertTrue(actualPermanentAdress.contains(expectedPermanentAdress));
    }

    public static void Wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
