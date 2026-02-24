package Base;

import Pages.LoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();

    public final String URL = "https://ndosisimplifiedautomation.vercel.app/";
    public final String browserChoice = "chrome";

    public final WebDriver driver = browserFactory.startBrowser(browserChoice, URL);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

}
