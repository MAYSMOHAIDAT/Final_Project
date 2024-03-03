package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty", 
				"html:reports/cucumber_results.html",
				"json:reports/cucumber_results.json"
				},
		features="./src/test/resources/Features",
		glue="steps_definitions",
		tags="@verify_login_page"
		)



public class TestRunner {

}
