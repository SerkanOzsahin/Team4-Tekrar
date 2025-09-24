package Ibrahim;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _3 {
    public static void main(String[] args) {

        WebDriver driver = BaseDriver.driver("https://practicetestautomation.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        WebElement practiceBtn = driver.findElement(By.cssSelector("ul .menu-item-20"));
        wait.until(ExpectedConditions.elementToBeClickable(practiceBtn));
        practiceBtn.click();

        WebElement practiceText = driver.findElement(By.cssSelector(".post-title"));
        wait.until(ExpectedConditions.visibilityOf(practiceText));

        WebElement textLoginPage = driver.findElement(By.xpath("//a[text()='Test Login Page']"));
        wait.until(ExpectedConditions.elementToBeClickable(textLoginPage));
        textLoginPage.click();

        WebElement testLoginText = driver.findElement(By.cssSelector("section h2"));
        wait.until(ExpectedConditions.visibilityOf(testLoginText));

        WebElement userNameGiven = driver.findElement(By.cssSelector("b:nth-child(2)"));
        wait.until(ExpectedConditions.visibilityOf(userNameGiven));
        String userName = userNameGiven.getText();                                          // userName
        System.out.println(userName);

        WebElement passwordGiven = driver.findElement(By.cssSelector("b:nth-child(4)"));
        wait.until(ExpectedConditions.visibilityOf(passwordGiven));
        String password = passwordGiven.getText();                                          // password
        System.out.println(password);

        WebElement userNameSent = driver.findElement(By.cssSelector("input[type='text']"));
        userNameSent.sendKeys(userName);

        WebElement passwordSent = driver.findElement(By.cssSelector("input[type='password']"));
        passwordSent.sendKeys(password);

        WebElement submitBtn = driver.findElement(By.cssSelector("button[id='submit']"));;
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        submitBtn.click();

        WebElement succesfullLogInText = driver.findElement(By.cssSelector(".post-title"));
        wait.until(ExpectedConditions.visibilityOf(succesfullLogInText));

        WebElement logOutBtn = driver.findElement(By.cssSelector(".post-content a"));
        wait.until(ExpectedConditions.elementToBeClickable(logOutBtn));
        logOutBtn.click();

        WebElement practiceBtn2 = driver.findElement(By.cssSelector("ul .menu-item-20"));
        wait.until(ExpectedConditions.elementToBeClickable(practiceBtn2));
        practiceBtn2.click();

        driver.quit();
    }
}
