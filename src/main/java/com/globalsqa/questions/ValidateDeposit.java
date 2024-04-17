package com.globalsqa.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.globalsqa.ui.HomeUi.LBL_Deposit_Successful;

public class ValidateDeposit implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade label = LBL_Deposit_Successful.resolveFor(actor);

        return label.isVisible();
    }
    public static ValidateDeposit validateDeposit() {
        return new ValidateDeposit();

    }
}
