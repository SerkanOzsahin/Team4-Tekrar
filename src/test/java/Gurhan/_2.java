package Gurhan;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static Gurhan._1.Wait;

public class _2 {
    public static void main(String[] args) {
        final String fullName = "Meriç Sökeli";
        final String eMail = "mericsokeli09@gmail.com";
        final String curAddress = "Atatürk mah. 236. sok.No:3/5 Nazilli/AYDIN";
        final String perAddress = "Atatürk mah. 236. sok.No:3/5 Nazilli/AYDIN";

        WebDriver driver = BaseDriver.driver("https://demoqa.com/text-box");

        Wait(4);
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys(fullName);
        Wait(3);

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(eMail);
        Wait(3);

        WebElement curAddressInput = driver.findElement(By.id("currentAddress"));
        curAddressInput.sendKeys(curAddress);
        Wait(5);

        WebElement perAddressInput = driver.findElement(By.id("permanentAddress"));
        perAddressInput.sendKeys(perAddress);
        Wait(3);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
        Wait(3);

        String expectedFullname="Meriç Sökeli";
        String actualFullname=fullNameInput.getText();

        String expectedEmail="mericsokeli09@gmail.com";
        String actualEmail=emailInput.getText();

        String expectedCurAddress="Atatürk mah. 236. sok.No:3/5 Nazilli/AYDIN";
        String actualCurAddress=curAddressInput.getText();

        String expectedPerAddress="Atatürk mah. 236. sok.No:3/5 Nazilli/AYDIN";
        String actualPerAddress=perAddressInput.getText();

        Assert.assertEquals("Verdiğiniz isim-soyisim bilgileri eşleşmiyor.",expectedFullname,actualFullname);
        Assert.assertEquals("Verdiğiniz e-posta bilgileri eşleşmiyor.",expectedEmail,actualEmail);
        Assert.assertEquals("Verdiğiniz mevcut adres bilgileri eşleşmiyor.",expectedCurAddress,actualCurAddress);
        Assert.assertEquals("Verdiğiniz daimi adres bilgileri eşleşmiyor.",expectedPerAddress,actualPerAddress);

    }
}
