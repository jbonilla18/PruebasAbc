package com.globalsqa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.globalsqa.ui.HomeUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_LOGIN_CUSTOMER),
                Click.on(LNK_YOUR_NAME),
                Click.on(SEL_HARRY),
                Click.on(BTN_LOGIN),
                Click.on(BTN_CUENTA),
                Click.on(NUM_CUENTA),
                Click.on(BTN_DEPOSITO),
                Enter.keyValues("100").into(VAL_AMOUNT),
                Click.on(BTN_DEPOSITO2)

        );
    }

    public static Performable on(){
        return instrumented(HomeTask.class);
    }
}
