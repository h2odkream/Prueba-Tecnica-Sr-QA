package com.weel.util.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class ChangeFrame implements Interaction {
    private Target target;

    public ChangeFrame(Target target) {
        this.target = target;
    }

    public static ChangeFrame con(Target target) {
        return Tasks.instrumented(ChangeFrame.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().frame(target.resolveFor(actor));
    }
}
