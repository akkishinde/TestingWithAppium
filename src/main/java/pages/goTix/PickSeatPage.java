package pages.goTix;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by AkshayS on 19/10/16.
 */
public class PickSeatPage extends BasePage {
   /* @FindBy(xpath = "//android.widget.TextView[@clickable='true']")
    private List<WebElement> moviesTab;*/
   @FindBy(xpath = "//android.widget.TextView[@text='J15']")
   private WebElement moviesTab;
    @FindBy(id = "btn_review_order")
    private WebElement reviewOrder;

    public PickSeatPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }

    public void selectSeats() {
        waitForElement(moviesTab);
        moviesTab.click();
    }


    public void reviewOrder() {
        reviewOrder.click();
    }
}
