package com.weel.util.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ReturnFrame implements Interaction {
    public static ReturnFrame con() {
        return Tasks.instrumented(ReturnFrame.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().parentFrame();
    }
}
