package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.OpenBrowser;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PracticaStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^The user opens the page$")
    public void theUserOpensThePage() {
        theActorCalled("leider").wasAbleTo(OpenBrowser.withUrl());
    }

    @When("^The user tries of register with the email (.*)$")
    public void theUserTriesOfRegisterWithTheEmailLeiderYopmailCom(String email) {

    }

    @Then("^The user should see that success register$")
    public void theUserShouldSeeThatSuccessRegister() {

    }






}
