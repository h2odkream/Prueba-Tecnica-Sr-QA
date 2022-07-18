package com.weel.interaction;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitNow implements Interaction {
    private int time;

    public WaitNow(int time){
        super();
        this.time = time;
    }
    public static WaitNow oneMoment(int time){
        return Tasks.instrumented(WaitNow.class, time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(time);
    }
}
