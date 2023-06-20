package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        // Open URL  into browser
        driver.get(baseUrl);
        // Maximise the windows
        driver.manage().window().maximize();
        // Give to implicit wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is : " + title);
        // Get the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is : " + currentUrl);
        // Get page source
        System.out.println("Page source is : " + driver.getPageSource());
        // Enter Email field
        WebElement emailId = driver.findElement(By.id("Email"));
        emailId.sendKeys("bhak@1111");
        //Enter password field
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("abc2222");
        driver.close();

    }

}