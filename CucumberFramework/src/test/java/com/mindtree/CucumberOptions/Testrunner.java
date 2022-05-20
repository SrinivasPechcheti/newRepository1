package com.mindtree.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",
		monochrome=true,
		
plugin = {"pretty","junit:target/JUnitReports/report.xml"})

public class Testrunner extends AbstractTestNGCucumberTests{
	
}