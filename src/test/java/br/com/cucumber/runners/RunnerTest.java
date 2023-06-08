package br.com.cucumber.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

//tags = "@esse",
//tags = {"@tipo1", "@tipo2"}, //tem q ter as 2 anotações
//tags = {"@tipo1, @tipo2"}, //ou um ou outro

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features/aprender_cucumber.feature",
	glue = { "br.com.cucumber.steps", "br.com.cucumber.config" },
	tags = "not @ignore",
	plugin = "pretty",
	monochrome = true,
	snippets = SnippetType.CAMELCASE,
	dryRun = false //Serve apenas para mapear os cenarios se estao ok, o correto é ficar false	
)
public class RunnerTest {

}
