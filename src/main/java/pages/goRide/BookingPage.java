package pages.goRide;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by AkshayS on 18/10/16.
 */
public class BookingPage extends BasePage {
    @FindBy(id = "edit_text_source")
    private WebElement sourceEditText;
    @FindBy(id = "edit_text_destination")
    private WebElement destinationEditText;
    @FindBy(id = "location_name_container")
    private List<WebElement> locationNameContainer;
    @FindBy(id = "location_name_container")
    private List<WebElement> destinationLocationContainer;
    @FindBy(id = "cash_rd")
    private WebElement goPayRadioButton;
    @FindBy(id = "book_now_layout")
    private WebElement bookRideButton;

    public BookingPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }

    public void addSourceLocation(String sourceLocation) {
        sourceEditText.sendKeys(sourceLocation);
        locationNameContainer.get(0).click();

    }

    public void addDestinationLocation(String destinationLocation) {
        destinationEditText.sendKeys(destinationLocation);
        destinationLocationContainer.get(0).click();
    }


    public void selectPaymentMethodAsCashAndBookRide() {
        goPayRadioButton.click();
        bookRideButton.click();
    }
}
