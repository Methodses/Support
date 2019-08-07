package au.method.test.support.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/au/method/test/support/features/Contact.feature"},
        glue = {"au.method.test.support.Steps", "au.method.test.support.hooks"},
        tags = {"not @ignore"}
)
public class Runner_Contact {
}
