package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, glue = {"steps"}, plugin = {"pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber.json",}, monochrome = true)
public class loginRunner {

}
