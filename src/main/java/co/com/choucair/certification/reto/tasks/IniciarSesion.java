package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.models.TestLoombok;
import co.com.choucair.certification.reto.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

    TestLoombok testLoombok;

    public IniciarSesion(TestLoombok testLoombok) {
        this.testLoombok = testLoombok;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(testLoombok.getUser()).into(LoginPage.TXT_USER),
                Enter.theValue(testLoombok.getPass()).into(LoginPage.TXT_PASS),
                Click.on(LoginPage.BTN_LOGIN));
    }

    public static IniciarSesion ingresar(TestLoombok testLoombok){
        return Tasks.instrumented(IniciarSesion.class, testLoombok);
    }
}
