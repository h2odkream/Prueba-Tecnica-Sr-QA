package com.weel.runners.millionandup;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/millionandup/schedule.feature",
        glue = {"com.weel.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ScheduleRunner {
}
