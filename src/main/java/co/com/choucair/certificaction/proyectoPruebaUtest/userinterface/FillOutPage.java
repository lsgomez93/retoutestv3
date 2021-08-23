package co.com.choucair.certificaction.proyectoPruebaUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillOutPage {
    public static final Target BUTTON_LOCATION = Target.the("Button get form location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("Button get form location")
            .located(By.id("city"));
    public static final Target INPUT_CODE_POSTAL = Target.the("Button get form location")
            .located(By.id("zip"));
    public static final Target OPTION_COUNTRY = Target.the("Button get form location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("Button get form location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
}
