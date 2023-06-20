package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static String browser = "Chrome";
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
        // Open URL
        driver.get(baseUrl);
        // Maximise the windows
        driver.manage().window().maximize();
        // Get the title of the page
        System.out.println("Title of the page is : "+ driver.getTitle());
        // Current Url
        System.out.println("Current URL is : "+ driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source is : " +driver.getPageSource());
        // Enter the Username
        driver.findElement(By.id("username")).sendKeys("bhak4444");
        // Enter the password
        driver.findElement(By.id("password")).sendKeys("abc@2222");
        // Close the browser
        driver.close();
}
}