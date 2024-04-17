package com.globalsqa.stepDefinitions;

import com.globalsqa.task.CrearClienteTask;
import com.globalsqa.task.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefCrear {

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Dado("que el administrador ingresa al mánager del banco")
    public void que_el_administrador_ingresa_al_mánager_del_banco() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"),
                CrearClienteTask.on()
        );
    }
    @Cuando("ingrese a la opción de {string}")
    public void ingrese_a_la_opción_de(String string) {
    }
    @Entonces("creara un cliente con nombre {string} y código postal {string}")
    public void creara_un_cliente_con_nombre_y_código_postal(String string, String string2) {
    }
}
