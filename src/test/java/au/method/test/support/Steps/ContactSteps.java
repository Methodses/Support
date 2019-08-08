package au.method.test.support.Steps;

import au.method.test.support.pages.BasePage;
import au.method.test.support.pages.application.Contact;
import au.method.test.support.pages.application.Home;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactSteps {

    Home home = new Home();
    Contact contact = new Contact();

    @When("I enter contact details for the (.*)")
    public void the_user_enters_contact_details(String enquiryReason){
        contact.enterContactDetails(enquiryReason);
    }

    @When("I click on Contact Us link in the home page")
    public void I_click_Contact_Us_link(){
        home.clickContactUs();
    }

}
