package com.weel.tasks.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;

import static com.weel.userinterfaces.automationpractice.SearchProducPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SearchProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SEARCH),
                Enter.theValue("Faded Short Sleeve T-shirts").into(SEARCH),
                Click.on(SUBMIT_SEARCH),
                Click.on(IMAGE_T_SHIRT),
                Wait.until(the(NUMBER_OF_ITEMS),isPresent()).forNoMoreThan(10).seconds(),
                Click.on(NUMBER_OF_ITEMS),
                Click.on(COLOR_TYPE)
        );
    }

    public static SearchProducts on(){
        return Tasks.instrumented(SearchProducts.class);
    }

}
