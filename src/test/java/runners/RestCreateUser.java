package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/rest/create_user.feature",
        glue = {"stepdefinitions.rest","utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RestCreateUser {
}

