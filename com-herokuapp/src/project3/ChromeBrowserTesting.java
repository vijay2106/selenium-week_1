package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        // Open URL into the browser
        driver.get(baseUrl);
        //Maximise the windows
        driver.manage().window().maximize();
        // Give to implicit wait to browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is : "+title);
        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is : "+ currentUrl);
        // Get the page source
        System.out.println("Page source is : " + driver.getPageSource());
        // Enter the Username
        driver.findElement(By.id("username")).sendKeys("Bhak1111");
        // Enter the password
        driver.findElement(By.id("password"));
        // Close the browser
        driver.close();
    }
}