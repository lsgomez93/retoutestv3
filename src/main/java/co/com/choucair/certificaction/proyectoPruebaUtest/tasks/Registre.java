package co.com.choucair.certificaction.proyectoPruebaUtest.tasks;

import co.com.choucair.certificaction.proyectoPruebaUtest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.RegistrePersonalPage.*;

public class Registre implements Task {
    private UtestData utestData;

    public Registre(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Registre onTheDataPersonal(UtestData utestData) {
        
        return Tasks.instrumented(Registre.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_JOIN_REGISTRE),
                Enter.theValue(utestData.getStrFirstname()).into(INPUT_FIRSTNAME),
                Enter.theValue(utestData.getStrLastname()).into(INPUT_LASTNAME),
                Enter.theValue(utestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getStrMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(utestData.getStrDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(utestData.getStrYear()).from(SELECT_YEAR)

        );
    }
}
