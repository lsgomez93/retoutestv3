package co.com.choucair.certificaction.proyectoPruebaUtest.tasks;

import co.com.choucair.certificaction.proyectoPruebaUtest.model.UtestData;
import co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.InsertToPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.InsertToPage.*;

public class InsertTo implements Task {
    private UtestData utestData;

    public InsertTo(UtestData utestData) {
        this.utestData = utestData;
    }

    public static InsertTo theinformationDevices(UtestData utestData) {

        return Tasks.instrumented(InsertTo.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_DEVICES),
                Click.on(OPTION_SYSTEM_OPERATING_COMPUTADOR),
                Enter.theValue(utestData.getStrSystemOperatingComputer()).into(INPUT_SYSTEM_OPERATING_COMPUTADOR),
                Hit.the(Keys.ENTER).into(INPUT_SYSTEM_OPERATING_COMPUTADOR),
                Click.on(OPTION_VERSION_SYSTEM_OPERATING_COMPUTADOR),
                Enter.theValue(utestData.getStrVersionSystemOperatingComputer()).into(INPUT_VERSION_SYSTEM_OPERATING_COMPUTADOR),
                Hit.the(Keys.ENTER).into(INPUT_VERSION_SYSTEM_OPERATING_COMPUTADOR),
                Click.on(OPTION_LENGUAGE_SYSTEM_OPERATING_COMPUTADOR),
                Enter.theValue(utestData.getStrLanguageSystemOperatingComputer()).into(INPUT_LANGUAGE_SYSTEM_OPERATING_COMPUTADOR),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE_SYSTEM_OPERATING_COMPUTADOR),
                Click.on(OPTION_SELECT_BRAND_PHONE),
                Enter.theValue(utestData.getStrBrandPhone()).into(INPUT_BRAND_PHONE),
                Hit.the(Keys.ENTER).into(INPUT_BRAND_PHONE),
                Click.on(OPTION_SELECT_MODEL_PHONE),
                Enter.theValue(utestData.getStrModelPhone()).into(INPUT_MODEL_PHONE),
                Hit.the(Keys.ENTER).into(INPUT_MODEL_PHONE),
                Click.on(OPTION_SYSTEM_OPERTING_PHONE),
                Enter.theValue(utestData.getStrSystemOperatingPhone()).into(INPUT_SYSTEM_OPERTING_PHONE),
                Hit.the(Keys.ENTER).into(INPUT_SYSTEM_OPERTING_PHONE)
        );
    }
}
