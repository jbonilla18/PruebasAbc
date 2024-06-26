package com.globalsqa.task;

import com.globalsqa.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.junit.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.globalsqa.ui.CrearClienteUi.*;
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
      String alert_mensagge =  BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();

        System.out.println(alert_mensagge);
        String mensajeSinId = alert_mensagge.replaceAll("id :\\d+", "id :");
        Assert.assertEquals("Customer added successfully with customer id :", mensajeSinId);
    }
    public static Performable on(){
        return instrumented(CrearClienteTask.class);
    }
}
