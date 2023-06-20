package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {
    static String browser = "Firefox";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static WebDriver driver;

    public static void main(String[] args){
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser");
        }
        // Open URL
        driver.get(baseUrl);
        // Maximise the windows
        driver.manage().window().maximize();
        // Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is : " + currentUrl);
        // Print the title of page
        System.out.println("Title of the page is : " + driver.getTitle());
        // Get page source
        System.out.println("Page source is :" + driver.getPageSource());
        // Enter username field
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Kamlesh");
        // Enter password field
        driver.findElement(By.name("password")).sendKeys("acb1234");
        // Close browser
        driver.close();
}
}