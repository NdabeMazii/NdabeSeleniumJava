package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement emailField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement submitButton;

    @FindBy(xpath = "//span[text()='My Learning']")
    WebElement myLearningText;

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void verifyMyLearningText(String expectedText) {
        String actualText = myLearningText.getText();
        if (actualText.equals(expectedText)) {
            System.out.println("Test Passed: My Learning text is correct.");
        } else {
            System.out.println("Test Failed: Expected '" + expectedText + "' but got '" + actualText + "'.");
        }
    }

}
