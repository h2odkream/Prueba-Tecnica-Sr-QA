package com.weel.stepdefinitions.automationpractice;

import com.weel.questions.ValidateIf;
import com.weel.tasks.automationpractice.SearchProducts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static com.weel.exceptions.Error.ERROR_NO_PRODUCT_FOUND_MESSAGE;
import static com.weel.userinterfaces.automationpractice.SearchProducPage.ADD_CAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchProductStepDefinition {


    @Given("user accesses the website automation practice")
    public void useruserAccessesTheWebsiteAutomationPractice() {
        theActorCalled("Karen")
                .attemptsTo(
                        Open.url("http://automationpractice.com/index.php"));
    }

    @When("the user searches a product")
    public void theUserSearchesAProduct() {
        theActorInTheSpotlight()
                .attemptsTo(SearchProducts.on());

    }

    @Then("he should see a message")
    public void heShouldSeeAMessage() {
        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(ADD_CAR))
                        .orComplainWith(Error.class, ERROR_NO_PRODUCT_FOUND_MESSAGE)
        );
    }

}
