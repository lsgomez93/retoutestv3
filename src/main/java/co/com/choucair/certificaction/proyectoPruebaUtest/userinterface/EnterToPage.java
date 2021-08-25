package co.com.choucair.certificaction.proyectoPruebaUtest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EnterToPage {
    public static final Target BUTTON_SETTING_INFORMATION = Target.the("Button get form information Security")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("were we write password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("were we write confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("Check Stay informed")
            .located(By.name("newsletterOptIn"));
    public static final Target CHECK_TERMS_USE = Target.the("Check terms use")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY= Target.the("check privacity setting")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_SEND_INFORMATION = Target.the("Button get form information Security")
            .located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target MESSAGE_WELCOME = Target.the("Get name message welcome")
            .located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));

}
