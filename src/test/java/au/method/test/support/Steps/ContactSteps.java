package au.method.test.support.Steps;

import au.method.test.support.pages.BasePage;
import au.method.test.support.pages.application.Contact;
import au.method.test.support.pages.application.Home;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactSteps {

    Home home = new Home();

    @When("the user enters contact details")
    public void the_user_enters_contact_details(){

    }

    @Then("the entered values should be available in the form")
    public void the_entered_values_should_be_available_in_the_form(){

    }

    @When("the user clicks on Contact Us link in the home page")
    public void I_click_Contact_Us_link(){
        home.clickContactUs();
    }

}
