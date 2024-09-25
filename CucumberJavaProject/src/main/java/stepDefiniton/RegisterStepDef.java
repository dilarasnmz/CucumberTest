package stepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterStepDef {
    @Given("user navigates to the website appv2test.artiwise.cloud/register")
    public void user_navigates_to_register_page() {
        // Code to navigate to register page
    }

    @Given("there user logs in through Login Window by using Email as {string} and Password as {string}")
    public void user_logs_in_using_email_and_password(String email, String password) {
        // Code for registration
    }

    @Then("register must be successful.")
    public void register_must_be_successful() {
        // Code to verify successful registration
    }
}
