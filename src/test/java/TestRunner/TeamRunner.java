package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Team.feature", glue = "StepsClass", plugin = {"pretty","html:target\\Cucumber.html"}, tags = "@Tag1"
		)


public class TeamRunner {

}
