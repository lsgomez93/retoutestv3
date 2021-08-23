package co.com.choucair.certificaction.proyectoPruebaUtest.tasks;

import co.com.choucair.certificaction.proyectoPruebaUtest.model.UtestData;
import co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.FillOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.FillOutPage.*;

public class FillOut implements Task {
    private UtestData utestData;

    public FillOut(UtestData utestData) {
        this.utestData = utestData;
    }
    public static FillOut theInformationLocal(UtestData utestData) {
        return Tasks.instrumented(FillOut.class,utestData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_LOCATION),
                Enter.theValue(utestData.getStrCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(utestData.getStrCodePostal()).into(INPUT_CODE_POSTAL),
                Click.on(OPTION_COUNTRY),
                Enter.theValue(utestData.getStrCountry()).into(INPUT_COUNTRY).thenHit(Keys.ENTER)

        );
    }
}
