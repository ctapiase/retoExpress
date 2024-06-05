package co.com.choucair.certification.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidatesPage {
    public static final Target TXT_NOMBRE = Target.the("campo nombre").located(By.name("firstName"));
    public static final Target TXT_APELLIDO = Target.the("campo apellido").located(By.name("lastName"));
    public static final Target TXT_EMAIL = Target.the("campo email").locatedBy("(//input[@class='oxd-input oxd-input--active'])[2]");
    public static final Target BTN_SAVE = Target.the("boton grabar").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static final Target TXT_RECORD = Target.the("texto record").locatedBy("//span[@class='oxd-text oxd-text--span']");
}
