package com.mindtree.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="com.mindtree.StepDefinations",
		monochrome=true,
		
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/reports.json",
		"html:target/HtmlReports"})

public class Testrunner {
	
}