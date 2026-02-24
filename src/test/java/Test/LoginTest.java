package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidDetails() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")).click();
        driver.findElement(By.id("login-email")).sendKeys("ndabemazii@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Mazii@053103");
        driver.findElement(By.id("login-submit")).click();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#dashboard");

        Thread.sleep(5000);

        String myLearningText = driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[4]/button/span[2]")).getText();

        Assert.assertEquals(myLearningText, "My Learning");


    }

}
