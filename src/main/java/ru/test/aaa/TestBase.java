package ru.test.aaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public void initialization() {
        System.getProperty("webdriver.chrome.driver", "c:/chromedriver.exe" );
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
}
