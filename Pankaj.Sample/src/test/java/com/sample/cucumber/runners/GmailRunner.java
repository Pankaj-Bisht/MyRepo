package com.sample.cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/features/gmail",
		glue = "com.sample.cucumber.steps.gmail",
		dryRun = false
)

public class GmailRunner {

}
