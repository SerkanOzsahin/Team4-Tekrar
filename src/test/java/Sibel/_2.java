package Sibel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class _2 {
    /***
     * https://demoqa.com/text-box
     * bilgileri doldurun. doldurduktan sonra
     * en altta çıkan kutucuktaki bilgiler ile
     * sizin verdiğiniz bilgilerin eşleştiğini
     * kontrol edin (assert)
     */
    public static void main(String[] args) {

        String name = "Sibel Cebeci";
        String email = "mojito@gmail.com";
        String cAddress = "İstanbul Merkez";
        String pAddress = "Azerbaijan Merkez";

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        _1.Wait(3);
        fullName.sendKeys(name);

        WebElement boxEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        _1.Wait(3);
        boxEmail.sendKeys(email);

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        _1.Wait(3);
        currentAddress.sendKeys(cAddress);

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        _1.Wait(3);
        permanentAddress.sendKeys(pAddress);

        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
        _1.Wait(3);
        submitBtn.click();

        WebElement textBoxName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//p[@id='name']"))));
        String actualName = textBoxName.getText();
        Assert.assertTrue(actualName.contains(name));

        WebElement textBoxEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//p[@id='email']"))));
        String actualEmail = textBoxEmail.getText();
        Assert.assertTrue(actualEmail.contains(email));

        WebElement textBoxCurrent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//p[@id='currentAddress']"))));
        String actualCurrent = textBoxCurrent.getText();
        Assert.assertTrue(actualCurrent.contains(cAddress));

        WebElement textBoxPermanent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//p[@id='permanentAddress']"))));
        String actualPermanent = textBoxPermanent.getText();
        Assert.assertTrue(actualPermanent.contains(pAddress));

        driver.quit();
    }
}
