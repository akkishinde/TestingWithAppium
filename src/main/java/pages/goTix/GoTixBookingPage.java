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
public class GoTixBookingPage extends BasePage {
    @FindBy(xpath = "//android.support.v7.app.ActionBar.Tab/android.widget.TextView[@text='Movies']")
    private WebElement moviesTab;
    @FindBy(xpath = "//android.support.v7.app.ActionBar.Tab/android.widget.TextView[@text='My Tickets']")
    private WebElement ticketsTab;
    @FindBy(id = "img_movie")
    private List<WebElement> infernoMovie;
    @FindBy(id = "theater_name")
    private WebElement theater;
    @FindBy(id = "layout_date_one")
    private WebElement dateOne;
    @FindBy(xpath = "//android.widget.TableRow[1]/android.widget.TextView[2]")
    private WebElement timeOne;
    @FindBy(id = "btn_pick_seat")
    private WebElement pickUpSeat;
    @FindBy(id = "movie_title")
    private List<WebElement> movieTitle;

    public GoTixBookingPage(AndroidDriver driver) throws MalformedURLException {
        super(driver);
    }


    public void selectMoviesTab() {
        waitForElement(moviesTab);
        moviesTab.click();
    }

    public void selectInfernoMovie() {
        infernoMovie.get(0).click();
    }

    public void selectTheatre() {
        theater.click();
    }

    public void selectDate() {
        waitForElement(dateOne);
        dateOne.click();
    }

    public void selectTime() {
        waitForElement(timeOne);
        timeOne.click();
    }

    public void pickSeat() {
        pickUpSeat.click();
    }

    public void selectTicketsTab() {
        waitForElement(ticketsTab);
        ticketsTab.click();
    }

    public void verifyTicket() {
        waitForElement(movieTitle.get(0));
        Assert.assertTrue(!movieTitle.equals("INFERNO"));
    }
}
