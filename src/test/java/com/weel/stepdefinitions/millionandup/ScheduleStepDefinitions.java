package com.weel.stepdefinitions.millionandup;

import com.weel.questions.ValidateIf;
import com.weel.tasks.millionandup.Schedule;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static com.weel.exceptions.Error.ERROR_SUBMITTING_THE_FORM_MESSAGE;
import static com.weel.userinterfaces.milionandup.SchedulePage.ENTER_THE_SITE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ScheduleStepDefinitions {

    @Given("user accesses the website Million And Up")
    public void userAccessesTheWebsiteMillionAndUp() {
        theActorCalled("Karen")
                .attemptsTo(
                        Open.url("https://uat.millionandup.com"));
    }
    @When("he schedule a project")
    public void heScheduleAProject(DataTable dataTable) {
        int i=0;
        List<String> data = dataTable.row(0);
        theActorInTheSpotlight().attemptsTo(
                Schedule.on(data)
        );

    }
    @Then("he should see a summary of the schedule of the presentation")
    public void heShouldSeeASummaryOfTheSchedule() {
        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(ENTER_THE_SITE))
                        .orComplainWith(Error.class, ERROR_SUBMITTING_THE_FORM_MESSAGE)
        );
    }

}
