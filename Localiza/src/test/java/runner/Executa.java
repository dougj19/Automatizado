package runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import metodos.MetodosDeTestes;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "testes",
		tags = "@teste",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","http:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)

//
public class Executa {
	
	
	
	

}
