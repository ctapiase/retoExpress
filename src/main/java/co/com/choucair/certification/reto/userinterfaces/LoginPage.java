package co.com.choucair.certification.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target TXT_USER = Target.the("campo username").located(By.name("username"));

    public static final Target TXT_PASS = Target.the("campo password").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("boton login").locatedBy("//button[@type='submit']");

}
