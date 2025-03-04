package com.absatest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\com\\absatest\\resources\\Features",
        tags = "@CreateProfile",
        glue = "com\\absatest\\java\\StepDefinition",
        dryRun=false,
		plugin= {"pretty", "html:target/cucumber-reports/cucumber.html"}
)


public class TestRunner {

}

