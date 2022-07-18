package com.weel.tasks.demoqa;

import com.weel.interaction.DeterminePath;
import com.weel.models.Student;
import com.weel.util.FindDay;
import com.weel.util.automationpractice.Path;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import static com.weel.userinterfaces.demoqa.FillTextInformationPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class FillOut implements Task {
private Student dataUser;


public FillOut(Student dataUser){
    this.dataUser = dataUser;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean isWeekendDay = false;
        isWeekendDay = FindDay.isWeekend(dataUser.getMonth(),Integer.parseInt(dataUser.getDay()),Integer.parseInt(dataUser.getYear()));
        actor.attemptsTo(DeterminePath.ofImage());
        String pathImagen= actor.recall(Path.RUTA.returnValue()) + dataUser.getPath();

        actor.attemptsTo(
                Wait.until(the(FIRST_NAME), isVisible()).forNoMoreThan(20).seconds(),
                Check.whether(FIRST_NAME.isVisibleFor(actor)),
                Click.on(FIRST_NAME),
                Enter.theValue(dataUser.getFirstName()).into(FIRST_NAME),
                Click.on(LAST_NAME),
                Enter.theValue(dataUser.getLastName()).into(LAST_NAME),
                Click.on(EMAIL),
                Enter.theValue(dataUser.getEmail()).into(EMAIL),
                Click.on(GENDER_FEMALE),
                Click.on(MOBILE),
                Enter.theValue(dataUser.getMobile()).into(MOBILE),
                Click.on(DATE_OF_BIRD),
                SelectFromOptions.byVisibleText(dataUser.getMonth()).from(DATE_OF_BIRD_MONTH),
                SelectFromOptions.byVisibleText(dataUser.getYear()).from(DATE_OF_BIRD_YEAR));
        actor.attemptsTo(

                 /*   Check.whether(isWeekendDay)
                            .andIfSo(Wait.until(the(WEEKEND_DAY), isVisible()).forNoMoreThan(10).seconds(),
                                    JavaScriptClick.on(WEEKEND_DAY.of(dataUser.getDay())))
                            .otherwise(Wait.until(the(DAY), isVisible()).forNoMoreThan(10).seconds(),
                                    JavaScriptClick.on(DAY.of(dataUser.getDay()))),*/
                    Scroll.to(SUBJECTS),
                Wait.until(the(SUBJECTS), isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(SUBJECTS),
                Enter.theValue("Maths").into(SUBJECTS_INPUT)
                        .thenHit(Keys.DOWN)
                        .thenHit(Keys.ENTER),

                JavaScriptClick.on(HBBIES_ONE),
                Enter.keyValues(pathImagen).into(PICTURE),
                Enter.theValue(dataUser.getAddress()).into(CURRENT_ADDRESS),
                Scroll.to(SUBMIT_BUTTON),
                JavaScriptClick.on(STATE),
                Enter.theValue(dataUser.getState()).into(STATE_INPUT)
                        .thenHit(Keys.DOWN)
                        .thenHit(Keys.ENTER),
                JavaScriptClick.on(CITY),
                Wait.until(the(CITY_INPUT), isCurrentlyEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataUser.getCity()).into(CITY_INPUT),
                JavaScriptClick.on(SUBMIT_BUTTON)
                );
    }

    public static FillOut theForm(Student dataUser){
        return Tasks.instrumented(FillOut.class, dataUser);
    }
}
