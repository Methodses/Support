package au.method.test.support.Steps;

import au.method.test.support.pages.BasePage;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.*;
public class GenericSteps {

    @Then("the (.*) should be displayed")
    public void the_targetPage_should_be_displayed(String pageTitle){
        assertThat(BasePage.getPageTitle()).as("Page Title Verification").isEqualTo(pageTitle);
    }
}
