package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.models.TestLoombok;
import co.com.choucair.certification.reto.userinterfaces.CandidatesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registrar implements Task {

    TestLoombok testLoombok;

    public Registrar(TestLoombok testLoombok) {
        this.testLoombok = testLoombok;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(testLoombok.getName()).into(CandidatesPage.TXT_NOMBRE),
                Enter.theValue(testLoombok.getLastName()).into(CandidatesPage.TXT_APELLIDO),
                Enter.theValue(testLoombok.getEmail()).into(CandidatesPage.TXT_EMAIL),
                Click.on(CandidatesPage.BTN_SAVE));
    }

    public static Registrar Candidato(TestLoombok testLoombok){
        return Tasks.instrumented(Registrar.class, testLoombok);
    }
}
