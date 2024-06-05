package co.com.choucair.certification.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
    public static final Target BTN_RECLUTAMIENTO = Target.the("boton reclutamiento").locatedBy("//*[text()[contains(.,'Reclutamiento')]]");
    public static final Target BTN_ADD = Target.the("boton add").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public static final Target CAMP_POSTULANTE = Target.the("campo postulante").locatedBy("(//div[@class='oxd-table-cell oxd-padding-cell'])[3]");
    public static final Target CAMP_Estatus = Target.the("campo estatus").locatedBy("(//div[@class='oxd-table-cell oxd-padding-cell'])[6]");
}
