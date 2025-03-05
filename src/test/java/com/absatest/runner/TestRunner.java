package com.absatest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/absatest/resources/Features",
        tags = "@CreateProfile",
        glue = {"com.absatest.java.Hooks", "com.absatest.java.StepDefinition"}, 
        dryRun=false,
		plugin= {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)


public class TestRunner {

}

