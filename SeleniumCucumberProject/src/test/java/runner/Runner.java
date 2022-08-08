package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features", glue = { "stepDefinitions" }, monochrome = true, 
plugin = {"usage", "html:target/cucumber-reports", "json:target/JSON Reports/report.json",
		"junit:target/JUnit Reports/report.xml" }
//tags ="smoke"
)

public class Runner {

}
