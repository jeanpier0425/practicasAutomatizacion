package stepdefinitions;


import Tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import interactions.OpenBrowser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {


    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^El usuario abre la pagina$")
    public void elUsuarioAbreLaPagina() {
        theActorCalled("jham").wasAbleTo(OpenBrowser.withUrl());
    }

    @Cuando("^El usuario se loguea con los datos (.*) y (.*)$")
    public void elUsuarioSeLogueaConLosDatosLeiderYopmailComY(String email, String pass) {
        theActorInTheSpotlight().attemptsTo(Login.enLaPagina(email,pass));
    }

    @Entonces("^El login debe ser exitoso$")
    public void elLoginDebeSerExitoso() {

    }

}
