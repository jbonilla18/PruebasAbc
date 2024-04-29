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
    }

    @Cuando("seleccione la cuenta con numero {int}")
    public void seleccioneLaCuentaConNumero(Integer int1) {
        theActorCalled("user").wasAbleTo( HomeTask.on(int1));

    }

    @Cuando("seleccione la cuenta con numero Cuenta")
    public void seleccioneLaCuentaConNumeroCuenta(io.cucumber.datatable.DataTable dataTable) {
        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "Cuentas");


            OnStage.theActorInTheSpotlight()
                    .should(GivenWhenThen.seeThat(WebElementQuestion.the("NUM_CUENTA"),
                                    WebElementStateMatchers.containsText(dataExcel.get(1).get("Cuenta"))
                            )
                    );

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Entonces("realizara un deposito de {string} rupias exitosamente")
    public void realizaraUnDepositoDeRupiasExitosamente(String string) {
        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx", "Cuentas");


            OnStage.theActorInTheSpotlight()
                    .should(GivenWhenThen.seeThat(WebElementQuestion.the(VAL_AMOUNT),
                                    WebElementStateMatchers.containsText(dataExcel.get(1).get("Valor"))
                            )
                    );

        } catch (IOException e) {
            e.printStackTrace();
        }


        }

    public void ValidateDeposit() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateDeposit.validateDeposit(), Matchers.equalTo(true)
                )
        );
    }
}



