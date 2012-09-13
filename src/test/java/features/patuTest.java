package features;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

public class patuTest {

    @Given("^Patu is running$")
    public void Patu_is_running() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I connect to port '(\\d+)'$")
    public void I_connect_to_port_(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^The connection is 'accepted'$")
    public void The_connection_is_accepted() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
