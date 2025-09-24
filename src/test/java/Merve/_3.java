package Merve;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _3 {
    public static void main(String[] args) {
        WebDriver chromeDriver = BaseDriver.driver("https://practicetestautomation.com/");
        chromeDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(3));

        WebElement practice = chromeDriver.findElement(By.cssSelector("ul li:nth-child(2)"));
        wait.until(ExpectedConditions.elementToBeClickable(practice));
        practice.click();

        WebElement testLogIn = chromeDriver.findElement(By.xpath("//p/a[text()='Test Login Page']"));
        wait.until(ExpectedConditions.elementToBeClickable(testLogIn));
        testLogIn.click();

        String userName = "student";
        WebElement textUserName = chromeDriver.findElement(By.cssSelector("input[type='text']"));
        textUserName.sendKeys(userName);

        String password = "Password123";
        WebElement textPassword = chromeDriver.findElement(By.cssSelector("input[type='password']"));
       textPassword.sendKeys(password);

        WebElement submitButton = chromeDriver.findElement(By.cssSelector("button[id='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();

        WebElement successfulLogin = chromeDriver.findElement(By.cssSelector(".post-header>h1"));
        wait.until(ExpectedConditions.visibilityOf(successfulLogin));

        WebElement logOutBtn = chromeDriver.findElement(By.cssSelector(".post-content a"));
        wait.until(ExpectedConditions.elementToBeClickable(logOutBtn));
        logOutBtn.click();

        WebElement practice2 = chromeDriver.findElement(By.cssSelector("ul .menu-item-20"));
        wait.until(ExpectedConditions.elementToBeClickable(practice2));
        practice2.click();

    }
}
