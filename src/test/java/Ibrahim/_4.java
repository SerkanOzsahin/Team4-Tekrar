package Ibrahim;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _4 {
    public static void main(String[] args) {
        WebDriver driver = BaseDriver.driver("https://www.saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        String userName = "standard_user";
        String passWord = "secret_sauce";
        double total = 0;

        WebElement userNameBtn = driver.findElement(By.xpath("//input[@id='user-name']"));
        userNameBtn.sendKeys(userName);

        WebElement passwordBtn = driver.findElement(By.xpath("//input[@id='password']"));
        passwordBtn.sendKeys(passWord);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();

        WebElement appLogoText = driver.findElement(By.xpath("//div[@class='app_logo']"));
        wait.until(ExpectedConditions.visibilityOf(appLogoText));

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        System.out.println("----Prices----");
        for (WebElement p : prices) {
            System.out.println(p.getText());
            double price = Double.parseDouble(p.getText().replace("$",""));
            total += price;
        }

        System.out.println("Total: " + total);

        driver.quit();
    }
}
