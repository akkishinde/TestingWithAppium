package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by AkshayS on 18/10/16.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "input_email")
    private WebElement inputEmail;

    @FindBy(id = "input_password")
    private WebElement inputPassword;

    @FindBy(id = "button_signin")
    private WebElement signInButton;

    public LoginPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }

    public void login(String emailId, String passWord) {
        waitForElementBy(By.id("input_email"));
        inputEmail.sendKeys(emailId);
        inputPassword.sendKeys(passWord);
        signInButton.click();
    }
}
