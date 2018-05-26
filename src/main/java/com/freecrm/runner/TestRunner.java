package com.freecrm.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="com.freecrm.feature",
										glue= {"com.freecrm.stepdefinition"},
										monochrome=true,
										strict=true,
										dryRun=false)
public class TestRunner {

}
