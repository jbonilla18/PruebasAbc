package com.globalsqa.stepDefinitions;

import com.globalsqa.questions.ValidateDeposit;
import com.globalsqa.task.HomePageTask;
import com.globalsqa.task.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.junit.matchers.JUnitMatchers;

import static com.globalsqa.questions.ValidateDeposit.validateDeposit;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDef {


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Dado("que el cliente {string} se autentica en el banco")
    public void queElClienteSeAutenticaEnElBanco(String string) {
        theActorCalled("user").wasAbleTo(
                Open.url("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"),
                HomeTask.on()
        );
    }
    @Cuando("seleccione la cuenta con numero {string}")
    public void seleccioneLaCuentaConNumero(String string) {

    }
    @Entonces("realizara un depósito de {string} rupias exitosamente")
    public void ValidateDeposit() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateDeposit.validateDeposit(), Matchers.equalTo(true)
                )
        );
    }
    public void realizaraUnDepósitoDeRupiasExitosamente(String string)
        {

    }




}
