package au.method.test.support.Steps;

import au.method.test.support.pages.external.GooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class GooglePageSteps {

    GooglePage googlePage = new GooglePage();

    @Given("^I am in search engine$")
    public void the_user_is_navigated_to_search_engine(){
        googlePage.openGoogleSearch();
    }

    @When("I search for the (.*)")
    public void the_user_searches_for_the_keyword(String keyword){
        googlePage.searchForKeyword(keyword);
    }

    @When("I click on search link (.*)")
    public void the_user_clicks_on_link(String linkname){
        googlePage.clickSearchLink(linkname);
    }

}
