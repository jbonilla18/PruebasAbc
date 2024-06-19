package com.globalsqa.stepDefinitions;

import com.globalsqa.questions.ValidateDeposit;
import com.globalsqa.task.HomePageTask;
import com.globalsqa.task.HomeTask;
import com.globalsqa.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.it.Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.hamcrest.Matchers;
import org.junit.matchers.JUnitMatchers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


import static com.globalsqa.ui.HomeUi.VAL_AMOUNT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDef {


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Dado("que el cliente Harry Potter se autentica en el banco")
    public void queElClienteHarryPotterSeAutenticaEnElBanco() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login")

        );
        System.out.println("queElClienteHarryPotterSeAutenticaEnElBanco");
    }

    @Cuando("seleccione la cuenta con numero {int}")
    public void seleccioneLaCuentaConNumero(Integer int1) {
        theActorCalled("user").wasAbleTo( HomeTask.on(int1));

    }

    @Entonces("realizara un deposito de {string} rupias exitosamente")
    public void realizaraUnDepositoDeRupiasExitosamente(String string) {


   /* public void ValidateDeposit() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateDeposit.validateDeposit(), Matchers.equalTo(true)
                )
        );*/
    }
}



