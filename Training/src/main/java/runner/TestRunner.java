package runner;

import org.junit.runner.RunWith;

import base.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue={"stepDefinitions"},
		monochrome = true,
		plugin ={"pretty","json:target/cucumber.json","html:target/cucumber-reports"}
		
		)
public class TestRunner {

}
