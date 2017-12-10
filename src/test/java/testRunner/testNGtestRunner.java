package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
	@CucumberOptions(
	       
	        features = "Features",
	        glue="stepdefs"
	      
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}