package proiject_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();
        // Open URL
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get current url
        System.out.println("Current URL is : "+ driver.getCurrentUrl());
        // Get page title
        System.out.println("Page title is : "+driver.getTitle());
        // Get page source
        System.out.println("The page source is : " +driver.getPageSource());
        // Enter Username
        driver.findElement(By.id("user-name")).sendKeys("Bhak4444");
        // Enter the password
        driver.findElement(By.id("password")).sendKeys("abcde@2222");
        // Close the browser
        driver.close();
}

}
