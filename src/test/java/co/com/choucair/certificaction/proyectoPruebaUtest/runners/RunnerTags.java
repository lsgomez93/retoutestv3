package co.com.choucair.certificaction.proyectoPruebaUtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/utest.feature",
        tags = "@registeredUtest",
        glue = "co.com.choucair.certificaction.proyectoPruebaUtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class RunnerTags {
}
