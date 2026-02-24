package Test;

import Base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "testdata")
    public void loginWithValidDetails(String email, String password) throws InterruptedException {

        loginPage.clickLoginButton();
        Thread.sleep(2000);
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        loginPage.verifyMyLearningText("My Learning");

    }

    @DataProvider(name = "testdata")
    public Object[][] getData() {
        return new Object[][]{
                {"ndabemazii@gmail.com", "Mazii@053103" },
                {"Funda@gmail.com", "Funda@2026"},
                {"Kingmolebatsi2@gmail.com", "!2345678"},
                {"tumi@dima.com", "123@4567"}

        };
    }
}

