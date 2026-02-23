package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logIntoNdosiWeb {

    WebDriver driver;

    @Test
    public void loginWithValidDetails() throws InterruptedException {

        driver= new ChromeDriver();
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        driver.findElement(By.id("login-email")).sendKeys("ndabezinhlemazibuko6@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Mazii@053103");
        driver.findElement(By.id("login-submit")).click();
        driver.get("https://ndosiautomation.co.za/#dashboard");

        Thread.sleep(5000);


        try {
            driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[3]/div[1]/div[1]/button")).click();
            driver.get("https://www.ndosiautomation.co.za/#courses");

        } catch (Exception e) {
            driver.get("https://www.ndosiautomation.co.za/");
        }

        // Close browser
        driver.quit();


    }
}
