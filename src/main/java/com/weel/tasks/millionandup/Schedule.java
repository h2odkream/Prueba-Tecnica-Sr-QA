package com.weel.tasks.millionandup;

import com.weel.interaction.WaitNow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.weel.userinterfaces.milionandup.SchedulePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Schedule implements Task {
    private List<String> data;

    public Schedule(List<String> data){
        this.data = data;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(SCHEDULE_BUTTON),
                JavaScriptClick.on(SCHEDULE_BUTTON),
                WaitUntil.the(DATE_PICKER,isPresent()),
                Click.on(DATE_PICKER),
                Click.on(MONTH),
                Click.on(MONTH),
                Click.on(DAY.of(data.get(0))),
                Click.on(ZOOM_VIDEO_CALL),
                Enter.theValue(data.get(1)).into(EMAIL),
                Click.on(SCHEDULE_PRESENTATION),
                Enter.theValue(data.get(2)).into(NAME),
                Enter.theValue(data.get(3)).into(PHONE),
                Click.on(SCHEDULE_PRESENTATION),
                WaitNow.oneMoment(10)

        );
    }

    public static Schedule on(List<String> data){
        return Tasks.instrumented(Schedule.class, data);
    }
}
