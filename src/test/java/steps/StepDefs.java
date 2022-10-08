package steps;

import io.cucumber.java8.En;
import pages.Page;

public class StepDefs extends Page implements En {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) -> getUrl(url));

        When("I click on sign in tab", () -> {

        });

        Then("I should be navigated to sig in page", () -> {

        });

    }

}
