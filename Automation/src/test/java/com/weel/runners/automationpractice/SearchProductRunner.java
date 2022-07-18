package com.weel.runners.automationpractice;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automationpractice/search_by_word.feature",
        glue = {"com.weel.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SearchProductRunner {
}
