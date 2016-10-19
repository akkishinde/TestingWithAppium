package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import pages.goTix.GoTixBookingPage;
import pages.goTix.PickSeatPage;
import pages.goTix.ReviewOrderPage;
import pages.goTix.TicketConfirmationPage;

/**
 * Created by AkshayS on 19/10/16.
 */
public class GotixSteps extends BaseStep {
    @Given("^I topup my gopay balance for goTixUser with (\\d+)$")
    public void iTopupMyGopayBalanceForGoTixUserWith(int arg0) throws Throwable {
    }

    @Given("^On Home Page User log in using details of goTixUser and tap on GO-TIX$")
    public void onHomePageUserLogInUsingDetailsOfGoTixUserAndTapOnGOTIX() throws Throwable {
        new LoginPage(driver).login("akshay.shinde@go-jek.com", "leftshift@1234");
        new HomePage(driver).tapsOnGoTix();
    }

    @When("^On Go-Tix Event Page User taps on movies tab and taps on movie Inferno$")
    public void onGoTixEventPageUserTapsOnMoviesTabAndTapsOnMovieInferno() throws Throwable {
        new GoTixBookingPage(driver).selectMoviesTab();
        new GoTixBookingPage(driver).selectInfernoMovie();
    }

    @When("^On Go-Tix Movie Page User taps on theater$")
    public void onGoTixMoviePageUserTapsOnTheater() throws Throwable {
        new GoTixBookingPage(driver).selectTheatre();
    }

    @And("^On Go-Tix Movie Page User selects the Date and Time for movie and taps on pick seat$")
    public void onGoTixMoviePageUserSelectsTheDateAndTimeForMovieAndTapsOnPickSeat() throws Throwable {
        new GoTixBookingPage(driver).selectDate();
        new GoTixBookingPage(driver).selectTime();
        new GoTixBookingPage(driver).pickSeat();
    }

    @And("^On Go-Tix Movie Page User selects the seats and taps on Review Order$")
    public void onGoTixMoviePageUserSelectsTheSeatsAndTapsOnReviewOrder() throws Throwable {
        new PickSeatPage(driver).selectSeats();
        new PickSeatPage(driver).reviewOrder();
    }

    @And("^On Go-Tix Order Preview Page User verifies movie ticket price and makes payment$")
    public void onGoTixOrderPreviewPageUserVerifiesMovieTicketPriceAndMakesPayment() throws Throwable {
        new ReviewOrderPage(driver).selectGoPayAsPayment();
        new ReviewOrderPage(driver).orderTickets();
    }

    @When("^On Go-Tix Order Confirmation Page User verifies tickets successfully ordered and taps see tickets$")
    public void onGoTixOrderConfirmationPageUserVerifiesTicketsSuccessfullyOrderedAndTapsSeeTickets() throws Throwable {
        new TicketConfirmationPage(driver).verifyTikets();
        new TicketConfirmationPage(driver).seeTickets();
    }

    @Then("^On Go-Tix My Tickets Page User verifies his movie ticket$")
    public void onGoTixMyTicketsPageUserVerifiesHisMovieTicket() throws Throwable {
        new GoTixBookingPage(driver).selectTicketsTab();
        new GoTixBookingPage(driver).verifyTicket();
    }
}
