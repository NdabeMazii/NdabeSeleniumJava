package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginToNdosiWebSite {

    WebDriver driver;

    @Test
    public void loginWithValidDetails() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        driver.findElement(By.id("login-email")).sendKeys("ndabemazii@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Mazii@053103");
        driver.findElement(By.id("login-submit")).click();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#dashboard");

        Thread.sleep(5000);

        String myLearningText = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[4]/button/span[2]")).getText();
        if (myLearningText.equals("My Learning")) {
            System.out.println("Test Passed: My Learning text is correct.");
        } else {
            System.out.println("Test Failed: Expected 'My Learning' but got '" + myLearningText + "'.");
        }

    }

}



