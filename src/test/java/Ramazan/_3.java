package Ramazan;

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
        WebDriver driver = BaseDriver.driver("https://practicetestautomation.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement praticeBtn = driver.findElement(By.cssSelector("ul li:nth-child(2)"));
        wait.until(ExpectedConditions.visibilityOf(praticeBtn));
        praticeBtn.click();

        WebElement testloginPage = driver.findElement(By.xpath("//a[text()='Test Login Page']"));
        wait.until(ExpectedConditions.elementToBeClickable(testloginPage));
        testloginPage.click();

        String getusername = driver.findElement(By.cssSelector("ul > li :nth-child(2)")).getText();
        System.out.println(getusername);
        WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
        username.sendKeys(getusername);

        String getpassword = driver.findElement(By.cssSelector("ul > li :nth-child(4)")).getText();
        System.out.println(getpassword);
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys(getpassword);

        WebElement submitBtn = driver.findElement(By.cssSelector("button[id='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        submitBtn.click();

        WebElement success = driver.findElement(By.cssSelector("div > h1"));
        wait.until(ExpectedConditions.visibilityOf(success));

        String expectedText = "Logged In Successfully";
        String actualText = success.getText();

        Assert.assertEquals("Yanlış sayfa", expectedText, actualText);

        WebElement logout = driver.findElement(By.cssSelector("section a"));
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();

        WebElement praticeBtn1 = driver.findElement(By.cssSelector("ul li:nth-child(2)"));
        wait.until(ExpectedConditions.visibilityOf(praticeBtn1));
        praticeBtn1.click();
    }
}
