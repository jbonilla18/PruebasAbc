package com.globalsqa.task;

import com.globalsqa.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.globalsqa.ui.HomeUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.ui.Select.optionNumber;

public class HomeTask implements Task {
        private static ArrayList<Map<String, String>> leerExcel = new ArrayList();

    private int valor1;

    public HomeTask(int valor1) {
        this.valor1 = valor1;
    }


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
                Click.on(BTN_CUENTA)
        );
       actor.attemptsTo(

                Click.on(BTN_UBICACIONES.of(leerExcel.get(valor1).get("Cuenta"))),
                Click.on(BTN_DEPOSITO),
                Enter.keyValues(leerExcel.get(valor1).get("Valor")).into(VAL_AMOUNT),
                Click.on(BTN_DEPOSITO2)

        );
    }

    public static Performable on(int valor1) {
        return instrumented(HomeTask.class, valor1);
    }
}
