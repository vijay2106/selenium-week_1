package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String browser = "Chrome";

    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        // Open URL
        driver.get(baseUrl);
        // Maximise windows
        driver.manage().window().maximize();
        // Get title
        String title = driver.getTitle();
        System.out.println(title);
        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
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