package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "src\\test\\resources\\Features",
		glue = "stepsDefinitions",
		tags = "@AutenticacaoSemSenha",
		snippets = SnippetType.CAMELCASE,
		monochrome = false,
		dryRun = false
		)

public class RunnerTest {

}
