package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import appiumCore.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/",
        glue = "steps",
		plugin = { "pretty"}, 
		monochrome = true,
		snippets = SnippetType.CAMELCASE
)
public class Runner {
	
	@AfterClass
	public static void encerrarApp() {
		DriverFactory.killDriver();
	}
	 
}
