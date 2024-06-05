package co.com.choucair.stepdefinitions;


import co.com.choucair.certification.reto.models.TestLoombok;
import co.com.choucair.certification.reto.tasks.Ingresar;
import co.com.choucair.certification.reto.tasks.IniciarSesion;
import co.com.choucair.certification.reto.tasks.Registrar;
import co.com.choucair.certification.reto.questions.ValidateState;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;


import static co.com.choucair.certification.reto.utils.GlobalData.ACTOR;
import static co.com.choucair.certification.reto.utils.GlobalData.URL;

public class RegistroStepdefinitions {

  @Given("El usuario inicia sesion en la pagina opensource")
    public void elUsuarioIniciaSesionEnLaPaginaOpensource(DataTable table) {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.ingresar(TestLoombok.setData(table).get(0)));
    }

    @When("El usuario ingresa a la funcionalidad Recruitmen")
    public void elUsuarioIngresaALaFuncionalidadRecruitmen() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.Reclutamiento());
    }
    @When("Diligencia el formulario al deplegar el boton Add")
    public void diligenciaElFormularioAlDeplegarElBotonAdd(DataTable table) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registrar.Candidato(TestLoombok.setData(table).get(0)));
    }
    @Then("Se debe visualizar el estado Hired al finalizar el registro")
    public void seDebeVisualizarElEstadoHiredAlFinalizarElRegistro(DataTable table) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateState.Validate(TestLoombok.setData(table).get(0))));
    }
}
