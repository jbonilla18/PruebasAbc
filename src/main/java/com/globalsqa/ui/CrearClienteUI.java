package com.globalsqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearClienteUI {

    public static final Target LNK_LOGIN_BANK=Target.the("Acceso a Bank Manager Login")
            .located(By.xpath("//button[contains(@class, 'btn-primary')  and contains(text(), 'Bank Manager Login')]"));
    public static final Target LNK_ADD_CUSTOMER=Target.the("Acceso a Add Customer")
            .located(By.cssSelector("button.btn.btn-lg.tab[ng-click='addCust()']"));
    public static final Target LNK_FIRST_NAME=Target.the("Escriba el primer nombre Pepito")
            .located(By.cssSelector("input.form-control[ng-model='fName']"));
    public static final Target LNK_LAST_NAME=Target.the("Escriba el Apellido Perez")
            .located(By.cssSelector("input.form-control[ng-model='lName']"));

    public static final Target LNK_POST_CODE=Target.the("Escriba el codigo postal A1115B")
            .located(By.cssSelector("input.form-control[ng-model='postCd']"));

    public static final Target LNK_ADD_CUSTOMER2=Target.the("Boton adicionar Clinte")
            .located(By.cssSelector("button.btn.btn-default[type='submit'][value='']"));



}
