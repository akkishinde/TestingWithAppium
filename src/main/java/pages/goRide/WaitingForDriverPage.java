package pages.goRide;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.MalformedURLException;

/**
 * Created by AkshayS on 18/10/16.
 */
public class WaitingForDriverPage extends BasePage {
    @FindBy(id = "please_text_view")
    private WebElement waitingForDriverTextView;

    public WaitingForDriverPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }

    public void waitingForDriverTextVisible() {
        waitForElement(waitingForDriverTextView);
        waitingForDriverTextView.isDisplayed();
    }
}
