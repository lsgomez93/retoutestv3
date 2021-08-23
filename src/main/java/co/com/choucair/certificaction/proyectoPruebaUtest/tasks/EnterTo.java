package co.com.choucair.certificaction.proyectoPruebaUtest.tasks;

import co.com.choucair.certificaction.proyectoPruebaUtest.model.UtestData;
import co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.EnterToPage;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.EnterToPage.*;


public class EnterTo implements Task {
    private UtestData utestData;

    public EnterTo(UtestData utestData) {
        this.utestData = utestData;
    }

    public static EnterTo theInformacionSecurity(UtestData utestData) {
        return Tasks.instrumented(EnterTo.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_SETTING_INFORMATION),
                Enter.theValue(utestData.getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.getStrConfirmPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMS_USE),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_SEND_INFORMATION)
        );
    }
}
