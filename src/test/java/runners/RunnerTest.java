package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src/test/resources/features",
		glue = "stepsDefinitions",
		snippets = SnippetType.CAMELCASE, //prop para gerar os metodos dos step tests em camel case
		monochrome = false,//prop pra deixar tudo branco no console
		dryRun = false //prop para gerar apenas os step tests faltantes, sem executar todo o processo
		)

public class RunnerTest {
	
}
