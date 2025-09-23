package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    public static WebDriver driver(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}
