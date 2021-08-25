package co.com.choucair.certificaction.proyectoPruebaUtest.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certificaction.proyectoPruebaUtest.userinterface.EnterToPage.*;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensajeWelcome = Text.of(MESSAGE_WELCOME).viewedBy(actor).asString();
        System.out.println("welcome?" + mensajeWelcome);
        if (question.equals(mensajeWelcome)) {
            result = true;
            System.out.println("Bienvenido" + mensajeWelcome);
        } else {
            result = false;
        }
        return result;
    }
}
