package project_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        // Open URL into browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait to the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get page title
        System.out.println("Page title is : "+driver.getTitle());
        // Get current URL
        System.out.println("Current URL is : "+driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source is : "+driver.getPageSource());
        // Enter the username
        driver.findElement(By.id("user[email]")).sendKeys("Bhak@4545");
        // Enter the password
        driver.findElement(By.id("user[password]")).sendKeys("abcd@1111");
        //Close the browser
        driver.close();
    }

}
