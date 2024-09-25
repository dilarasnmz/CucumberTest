package stepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFeatureStepDef {
    @Given("user navigates to the website appv2test.artiwise.cloud/login")
    public void user_navigates_to_login_page() {
        // Code to navigate to login page
    }

    @Given("there user logs in through Login Window by using Username as {string} and Password as {string}")
    public void user_logs_in_using_username_and_password(String username, String password) {
        // Code for login
    }

    @Then("login must be successful.")
    public void login_must_be_successful() {
        // Code to verify successful login
    }
}
