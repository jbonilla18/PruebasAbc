package com.globalsqa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUi {

    public static final Target LNK_LOGIN_CUSTOMER=Target.the("Acceso a Login")
            .located(By.xpath("//button[contains(@class, 'btn-primary')  and contains(text(), 'Customer Login')]"));

    public static final Target LNK_YOUR_NAME=Target.the("Your Name")
            .located(By.id("userSelect"));

    public static final Target SEL_HARRY=Target.the("Harry Potter")
            .located(By.xpath("//select[@id='userSelect']/option[text()='Harry Potter']"));

    public static final Target BTN_LOGIN=Target.the("Login")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target BTN_CUENTA=Target.the("Cuenta")
            .located(By.id("accountSelect"));

    public static final Target BTN_UBICACIONES = Target.the("Boton seleccionar una ubicacion")
            .locatedBy("//select[@id='accountSelect']/option[@value='number:{0}']");

    public static final Target BTN_DEPOSITO=Target.the("Boton Deposito")
            .located(By.xpath("//button[@ng-click='deposit()']"));

    public static final Target VAL_AMOUNT=Target.the("AMOUNT")
            .located(By.xpath("//input[@type='number' and @ng-model='amount']"));

    public static final Target BTN_DEPOSITO2=Target.the("Boton Deposito Final")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target LBL_Deposit_Successful=Target.the("Mensaje Deposit Successful")
            .located(By.xpath("//span[@class='error ng-binding' and @ng-show='message']\n"));

    public static final Target LBL_Deposit_Successfl=Target.the("Mensaje Deposit Successful")
            .locatedByFirstMatching();
}
