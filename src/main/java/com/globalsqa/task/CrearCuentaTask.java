package com.globalsqa.task;

import com.globalsqa.interactions.EsperaImplicita;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

import static com.globalsqa.ui.CrearClienteUi.LNK_ADD_CUSTOMER;
import static com.globalsqa.ui.CrearClienteUi.LNK_LOGIN_BANK;
import static com.globalsqa.ui.CrearCuentaUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearCuentaTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_LOGIN_BANK),
                Click.on(LNK_OPEN_ACCOUNT),
                Click.on(BTN_CUSTOMER),
                Click.on(LNK_CUSTOMER_NAME),
                Click.on(BTN_CURRENCY),
                Click.on(LNK_CURRENCY),
                Click.on(BTN_PROCESS)
        );
        String alert_mensagge =  BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();

        System.out.println(alert_mensagge);
    }

        public static Performable on(){
            return instrumented(CrearCuentaTask.class);

    }
}
