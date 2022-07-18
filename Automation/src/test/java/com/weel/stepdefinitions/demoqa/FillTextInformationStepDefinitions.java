package com.weel.stepdefinitions.demoqa;

import com.weel.questions.ValidateIf;
import com.weel.tasks.demoqa.FillOut;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

import static com.weel.exceptions.Error.ERROR_FILLING_OUT_THE_FORM_MESSAGE;
import static com.weel.models.builders.StudentBuilder.withFirstName;
import static com.weel.userinterfaces.demoqa.FillTextInformationPage.THANK_FOR_SUBMIT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FillTextInformationStepDefinitions {

    @Given("user accesses the website")
    public void userAccessesTheWebsite() {
        theActorCalled("Karen")
                .attemptsTo(
                        Open.url("https://demoqa.com/automation-practice-form"));
    }
    @When("he enters all information")
    public void heEntersAllInformation(DataTable dataTable) {
        int i=0;
        List<String> dataStudent = dataTable.row(0);
        theActorInTheSpotlight().attemptsTo(
                FillOut.theForm(withFirstName(dataStudent.get(i))
                        .withLastName(dataStudent.get(++i))
                        .withEmail(dataStudent.get(++i))
                        .withGender(dataStudent.get(++i))
                        .withMobile(dataStudent.get(++i))
                        .withSubject(dataStudent.get(++i))
                        .withHobbie(dataStudent.get(++i))
                        .withMonth(dataStudent.get(++i))
                        .withYear(dataStudent.get(++i))
                        .withDay(dataStudent.get(++i))
                        .withAddress(dataStudent.get(++i))
                        .withState(dataStudent.get(++i))
                        .withCity(dataStudent.get(++i))
                        .withPath(dataStudent.get(++i))
                )
        );

    }
    @Then("he should see a submiting message")
    public void heShouldSeeASubmitingMessage() {
        theActorInTheSpotlight().should(
                seeThat(ValidateIf.theElementIsPresent(THANK_FOR_SUBMIT))
                        .orComplainWith(Error.class, ERROR_FILLING_OUT_THE_FORM_MESSAGE)
        );
    }

}
