package co.com.choucair.certificaction.proyectoPruebaUtest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistrePersonalPage {

    public static final Target BUTTON_JOIN_REGISTRE = Target.the("Button get form registered Utest")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FIRSTNAME = Target.the("were we write firstname")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("were we write lastname")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("were we write email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("were we write month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("were we write day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("were we write year")
            .located(By.id("birthYear"));

}
