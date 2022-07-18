package com.weel.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ScenarioSetup {
    /**
     * This method sets the stage for opening the browser and the actor who will have the skills for the tasks.
     */
    @Before
    public void setup(){
        setTheStage(new OnlineCast());
    }
}
