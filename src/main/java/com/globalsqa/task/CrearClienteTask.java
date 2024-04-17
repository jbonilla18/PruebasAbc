package com.globalsqa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.globalsqa.ui.CrearClienteUI.*;
import static com.globalsqa.ui.HomeUi.LNK_LOGIN_CUSTOMER;
import static com.globalsqa.ui.HomeUi.VAL_AMOUNT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearClienteTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_LOGIN_BANK),
                Click.on(LNK_ADD_CUSTOMER),
                Enter.keyValues("Pepito").into(LNK_FIRST_NAME),
                Enter.keyValues("Perez").into(LNK_LAST_NAME),
                Enter.keyValues("A1115B").into(LNK_POST_CODE),
                Click.on(LNK_ADD_CUSTOMER2)

                );
    }
    public static Performable on(){
        return instrumented(CrearClienteTask.class);
    }
}
