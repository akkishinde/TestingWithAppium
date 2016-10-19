package pages.goTix;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.net.MalformedURLException;

/**
 * Created by AkshayS on 19/10/16.
 */
public class TicketConfirmationPage extends BasePage {
    @FindBy(id = "btn_my_ticket")
    private WebElement myTickets;
    @FindBy(id = "head_notice_text")
    private WebElement noticeText;

    public TicketConfirmationPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }


    public void seeTickets() {
        waitForElement(myTickets);
        myTickets.click();
    }

    public void verifyTikets() {
        waitForElement(noticeText);
        Assert.assertTrue(!noticeText.equals("TICKET SUCCESSFULLY PURCHASED"));
    }
}
