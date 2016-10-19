package pages.goTix;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.MalformedURLException;

/**
 * Created by AkshayS on 19/10/16.
 */
public class ReviewOrderPage extends BasePage {
    @FindBy(id = "radio_gopay_payment")
    private WebElement goPayPayment;
    @FindBy(id = "btn_order")
    private WebElement order;

    public ReviewOrderPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }

    public void selectGoPayAsPayment() {
        waitForElement(goPayPayment);
        goPayPayment.click();
    }

    public void orderTickets() {
        order.click();
    }
}
