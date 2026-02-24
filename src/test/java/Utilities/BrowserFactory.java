package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if(browserChoice.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserChoice.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserChoice.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.manage(). window().maximize();
        driver.get(url);
        return driver;
    }
    @Test
    public void testBrowserFactory() {
        WebDriver driver = startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
        // Add assertions or interactions with the browser here
    }
}
