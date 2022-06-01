package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/soap/add_two_numbers.feature",
glue = {"stepdefinitions.soap", "utils"},
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class SoapAddNumbers {
}
