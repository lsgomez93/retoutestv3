package co.com.choucair.certificaction.proyectoPruebaUtest.tasks;

import co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.OpenUpUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpUtest implements Task {
    private OpenUpUtestPage openUpUtestPage;

    public static OpenUpUtest onThe() {

        return Tasks.instrumented(OpenUpUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openUpUtestPage));
    }
}
