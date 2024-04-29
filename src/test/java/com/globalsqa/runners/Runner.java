package com.globalsqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/deposito.feature",
        //features = "src/test/resources/features/crearcliente.feature",
        //features = "src/test/resources/features/crearcuenta.feature",
        //tags = "@TEST1 or @TEST2 or @TEST3",
        //tags = "@TEST1",
        glue = "com.globalsqa.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class Runner {

}
