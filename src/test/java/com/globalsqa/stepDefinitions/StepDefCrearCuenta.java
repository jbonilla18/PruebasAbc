package com.globalsqa.stepDefinitions;

import com.globalsqa.task.CrearClienteTask;
import com.globalsqa.task.CrearCuentaTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefCrearCuenta {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Dado("que el administrador ingresa al banco")
    public void que_el_administrador_ingresa_al_banco() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"),
                CrearCuentaTask.on()
        );


    }
    @Cuando("Cuando ingrese a la opción de {string}")
    public void cuando_ingrese_a_la_opción_de(String string) {

    }
    @Entonces("creara una cuenta al cliente {string} de tipo {string}")
    public void creara_una_cuenta_al_cliente_de_tipo(String string, String string2) {

    }
}
