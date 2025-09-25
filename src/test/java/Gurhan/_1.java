package Gurhan;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1 {
    public static void main(String[] args) {

        final String fullName="Meriç Sökeli";
        final String eMail="mericsokeli09@gmail.com";
        final String curAddress="Atatürk mah. 236. sok.No:3/5 Nazilli/AYDIN";
        final String perAddress="Atatürk mah. 236. sok.No:3/5 Nazilli/AYDIN";

        WebDriver driver= BaseDriver.driver("https://demoqa.com/text-box");

Wait(4);
        WebElement fullNameInput= driver.findElement(By.id("userName"));
fullNameInput.sendKeys(fullName);
Wait(3);

        WebElement emailInput= driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(eMail);
        Wait(3);

        WebElement curAddressInput= driver.findElement(By.id("currentAddress"));
        curAddressInput.sendKeys(curAddress);
        Wait(5);

        WebElement perAddressInput= driver.findElement(By.id("permanentAddress"));
        perAddressInput.sendKeys(perAddress);
        Wait(3);

        WebElement submitBtn= driver.findElement(By.id("submit"));
        submitBtn.click();
        Wait(3);



    }
    public static void Wait(int saniye){
        try {
            Thread.sleep(saniye*1000L);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
