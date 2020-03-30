package RunnerTests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = {"src/Features"}, glue = {"StepDefinition/"},
	plugin = {"pretty","html:target/cucumber-html-report"})
 
public class RunnerTest {}
