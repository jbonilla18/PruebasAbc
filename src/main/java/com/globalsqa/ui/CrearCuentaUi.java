package com.globalsqa.ui;

import com.globalsqa.interactions.EsperaImplicita;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuentaUi {

    public static final Target LNK_LOGIN_BANK=Target.the("Acceso a Bank Manager Login")
            .located(By.xpath("//button[contains(@class, 'btn-primary')  and contains(text(), 'Bank Manager Login')]"));
    public static final Target LNK_OPEN_ACCOUNT=Target.the("Acceso a Open Account")
            .located(By.cssSelector("button.btn.btn-lg.tab[ng-click='openAccount()']"));

    public static final Target BTN_CUSTOMER=Target.the("Seleccionar Customer")
            .located(By.xpath("//select[@id='userSelect']"));

    public static final Target LNK_CUSTOMER_NAME=Target.the("Seleccionar nombre del Cliente Ron Weasly ")
            .located(By.xpath("//select[@id='userSelect']/option[text()='Ron Weasly']"));


    public static final Target BTN_CURRENCY=Target.the("Seleccionar tipo de cuenta")
            .located(By.xpath("//select[@id='currency']"));

    public static final Target LNK_CURRENCY=Target.the("Seleccionar tipo de cuenta Dollar")
            .located(By.xpath("//select[@id='currency']/option[@value='Dollar']"));

    public static final Target BTN_PROCESS=Target.the("Seleccionar el boton Process")
            .located(By.xpath("//button[@type='submit']"));



}
