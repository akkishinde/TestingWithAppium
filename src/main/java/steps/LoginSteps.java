package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.goRide.BookingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.goRide.WaitingForDriverPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by AkshayS on 18/10/16.
 */
public class LoginSteps extends BaseStep {

    @Given("^Given I am on the Go-Jek app log in page$")
    public void givenIAmOnTheGoJekAppLogInPage() throws Throwable {
    }

    @When("^User enters email \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userEntersEmailAndPasswordAs(String email, String password) throws Throwable {
        new LoginPage(driver).login(email, password);
    }

    @Then("^Verify GoPay Amount$")
    public void verifyGoPayAmount() throws Throwable {
        new HomePage(driver).verifyGoPayBalance();
    }

    @Given("^User is logged in$")
    public void userIsLoggedIn() throws Throwable {
        new LoginPage(driver).login("akshay.shinde@go-jek.com", "leftshift@1234");
    }

    @And("^User taps on Go-Ride$")
    public void userTapsOnGoRide() throws Throwable {
        new HomePage(driver).tapsOnGoRide();
    }

    @When("^User selects Source location as \"([^\"]*)\"$")
    public void userSelectsSourceLocationAs(String sourceLocation) throws Throwable {
        new BookingPage(driver).addSourceLocation(sourceLocation);

    }

    @And("^User selects Destination location as \"([^\"]*)\"$")
    public void userSelectsDestinationLocationAs(String destinationLocation) throws Throwable {
        new BookingPage(driver).addDestinationLocation(destinationLocation);
    }

    @Then("^User sees finding driver page$")
    public void userSeesFindingDriverPage() throws Throwable {
      new WaitingForDriverPage(driver).waitingForDriverTextVisible();
    }

    @And("^User selects Payment Method as cash and books a Ride$")
    public void userSelectsPaymentMethodAsCashAndBooksARide() throws Throwable {
        new BookingPage(driver).selectPaymentMethodAsCashAndBookRide();
    }
}


