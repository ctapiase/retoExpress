package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterfaces.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Ingresar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuPage.BTN_RECLUTAMIENTO),
                Click.on(MenuPage.BTN_ADD));
    }

    public static Ingresar Reclutamiento(){
        return Tasks.instrumented(Ingresar.class);
    }
}
