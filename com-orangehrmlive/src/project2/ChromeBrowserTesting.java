package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // Launch the browser
        WebDriver driver = new ChromeDriver();
        // Open URL into browser
        driver.get(baseUrl);
        // Maximise the windows
        driver.manage().window().maximize();
        // Give to implicit wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get page source
        System.out.println("Page source is : " + driver.getPageSource());
        // Print title of the page
        String title = driver.getTitle();
        System.out.println(" Page title is : " +title);
        // Get current URL of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL of the page is : " + currentUrl);

        // Get username element and send the keys
        driver.findElement(By.name("username")).sendKeys("bhak1234");
        // Get and send keys to password
        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys("abc1234");
        driver.close();
    }
}