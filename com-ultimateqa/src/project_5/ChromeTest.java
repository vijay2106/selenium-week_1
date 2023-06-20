package project_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        WebDriver driver = new ChromeDriver();
        // Open URL
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get current url
        System.out.println("Current URL is : " + driver.getCurrentUrl());
        // Get page title
        System.out.println("Page title is : " + driver.getTitle());
        // Get page source
        System.out.println("The page source is : " + driver.getPageSource());
        // Enter Email
        driver.findElement(By.id("user[email]")).sendKeys("Bhak@55885");
        // Enter the password
        driver.findElement(By.id("user[password]")).sendKeys("abcd@3333");
        // Close the browser
        driver.close();
    }

}
