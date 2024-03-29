package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty", 
				"html:reports/cucumber_results.html",
				"json:reports/cucumber_results.json"
				},
		features="./src/test/resources/Features",
		glue="steps_definitions",
		tags="@update_items",
		dryRun=true
		)

public class Dryranner {

}
