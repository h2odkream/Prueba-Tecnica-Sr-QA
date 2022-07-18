package com.weel.runners.demoqa;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoqa/fill_text.feature",
        glue = {"com.weel.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class FillTextInformation {
}
