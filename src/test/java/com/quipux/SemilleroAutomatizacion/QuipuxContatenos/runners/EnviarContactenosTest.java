package com.quipux.SemilleroAutomatizacion.QuipuxContatenos.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/enviar_contactenos.feature",
        glue = {"com.quipux.SemilleroAutomatizacion.QuipuxContatenos"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class EnviarContactenosTest {

}
