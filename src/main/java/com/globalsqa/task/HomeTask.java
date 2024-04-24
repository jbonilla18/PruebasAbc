package com.globalsqa.task;

import com.globalsqa.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.globalsqa.ui.HomeUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

    public class HomeTask implements Task {
        private static ArrayList<Map<String, String>> leerExcel = new ArrayList();
    @Override
    public <T extends Actor> void performAs(T actor) {

       try {
            leerExcel = Excel.leerDatosDeHojaDeExcel("datos/Data.xlsx","Cuentas");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(LNK_LOGIN_CUSTOMER),
                Click.on(LNK_YOUR_NAME),
                Click.on(SEL_HARRY),
                Click.on(BTN_LOGIN),
                Click.on(BTN_CUENTA),
                Click.on(NUM_CUENTA),
                Click.on(BTN_DEPOSITO),
                Enter.keyValues(leerExcel.get(0).get("Valor")).into(VAL_AMOUNT),
                Click.on(BTN_DEPOSITO2)

        );
    }

    public static Performable on(){
        return instrumented(HomeTask.class);
    }
}
