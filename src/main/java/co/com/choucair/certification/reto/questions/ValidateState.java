package co.com.choucair.certification.reto.questions;

import co.com.choucair.certification.reto.models.TestLoombok;
import co.com.choucair.certification.reto.userinterfaces.CandidatesPage;
import co.com.choucair.certification.reto.userinterfaces.MenuPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateState implements Question<Boolean> {

    TestLoombok testLoombok;

    public ValidateState(TestLoombok testLoombok) {
        this.testLoombok = testLoombok;
    }
    Boolean ver = false;
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(CandidatesPage.TXT_RECORD, isVisible()).forNoMoreThan(30).seconds());

        ver = Text.of(CandidatesPage.TXT_RECORD).answeredBy(actor).contains(testLoombok.getRecord());

        actor.attemptsTo(Click.on(MenuPage.BTN_RECLUTAMIENTO));

        ver = (Text.of(MenuPage.CAMP_POSTULANTE).answeredBy(actor).contains(testLoombok.getName())) &&
                ((Text.of(MenuPage.CAMP_POSTULANTE).answeredBy(actor)).contains(testLoombok.getLastName())) &&
                (Text.of(MenuPage.CAMP_Estatus).answeredBy(actor).contains(testLoombok.getEstado()));

        return ver;
    }

    public static ValidateState Validate(TestLoombok testLoombok) {
        return Instrumented.instanceOf(ValidateState.class).withProperties(testLoombok);
    }
}
