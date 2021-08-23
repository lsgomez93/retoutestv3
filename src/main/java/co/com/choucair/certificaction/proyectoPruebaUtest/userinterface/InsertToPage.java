package co.com.choucair.certificaction.proyectoPruebaUtest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InsertToPage {
    public static final Target BUTTON_DEVICES = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target OPTION_SYSTEM_OPERATING_COMPUTADOR = Target.the("Button get Target")
            .located(By.cssSelector("#web-device > div:nth-child(1) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target INPUT_SYSTEM_OPERATING_COMPUTADOR = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target OPTION_VERSION_SYSTEM_OPERATING_COMPUTADOR = Target.the("Button get Target")
            .located(By.cssSelector("#web-device > div:nth-child(2) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target INPUT_VERSION_SYSTEM_OPERATING_COMPUTADOR = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OPTION_LENGUAGE_SYSTEM_OPERATING_COMPUTADOR = Target.the("Button get Target")
            .located(By.cssSelector("#web-device > div:nth-child(3) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target INPUT_LANGUAGE_SYSTEM_OPERATING_COMPUTADOR = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target OPTION_SELECT_BRAND_PHONE = Target.the("Button get Target")
            .located(By.cssSelector("#mobile-device > div:nth-child(1) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target INPUT_BRAND_PHONE = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target OPTION_SELECT_MODEL_PHONE = Target.the("Button get Target")
            .located(By.cssSelector("#mobile-device > div:nth-child(2) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target INPUT_MODEL_PHONE = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OPTION_SYSTEM_OPERTING_PHONE = Target.the("Button get Target")
            .located(By.cssSelector("#mobile-device > div:nth-child(3) > div.ui-select-box > div > div.ui-select-match > span"));
    public static final Target INPUT_SYSTEM_OPERTING_PHONE = Target.the("Button get Target")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));



}
