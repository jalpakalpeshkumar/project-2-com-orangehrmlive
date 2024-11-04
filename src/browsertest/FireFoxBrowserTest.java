package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-2 - ProjectName : com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Set up FirefoxBrowser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Forgot your password?’ link.
 * 7. Print the current URL.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email in the email field.
 * 11. Enter the password in the password field.
 * 12. Click on the Login Button.
 * 13. Close the browser.
 */

public class FireFoxBrowserTest {

    public static void main(String[] args) {

        //BaseUrl
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
//1. Set up Chrome browser.
        WebDriver driver = new FirefoxDriver();

//2. Open URL.
        driver.get(baseUrl);

//Maximise the Browser window
        driver.manage().window().maximize();

//We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

//4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The Current URL : " + currentUrl);

//5. Print the page source.
        System.out.println("The Page Source :" + driver.getPageSource());

        //6. Click on the ’Forgot your password?’ link.
        WebElement forgotLink = driver.findElement(By.className("orangehrm-login-forgot-header"));
        forgotLink.click();

//7. Print the current URL.
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

//8. Navigate back to the login page.
        driver.navigate().back();
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

//9. Refresh the page.
        driver.navigate().refresh();

//10. Enter the email in the email field.
        WebElement emailId = driver.findElement(By.name("username"));
        emailId.sendKeys("abc123@gmail.com");
//emailId.sendKeys("Admin");

//11. Enter the password in the password field.
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("xyz123@");
// password.sendKeys("admin123");

//12. Click on the Login Button.
        WebElement login = driver.findElement(By.className("orangehrm-login-button"));
        login.click();

//13. Close the browser.
        driver.quit();
    }
}


