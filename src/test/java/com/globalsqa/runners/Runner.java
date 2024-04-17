package com.globalsqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@TEST1 or @TEST2",
        glue = "com.globalsqa.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
//@deposito"+"@crearcliente
)
public class Runner {

}
