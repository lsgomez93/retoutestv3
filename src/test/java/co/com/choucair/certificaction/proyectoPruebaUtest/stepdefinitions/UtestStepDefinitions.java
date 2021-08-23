package co.com.choucair.certificaction.proyectoPruebaUtest.stepdefinitions;

import co.com.choucair.certificaction.proyectoPruebaUtest.model.UtestData;
import co.com.choucair.certificaction.proyectoPruebaUtest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {


    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Leidy wants registre page utest$")
    public void thanLeidyWantsRegistrePageUtest() {
        OnStage.theActorCalled("Leidy").wasAbleTo(OpenUpUtest.onThe());
    }

    @When("^she fillout information of the form$")
    public void sheFilloutInformationOfTheForm(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Registre.onTheDataPersonal(utestData.get(0)),
                FillOut.theInformationLocal(utestData.get(0)),
                InsertTo.theinformationDevices(utestData.get(0)),
                EnterTo.theInformacionSecurity(utestData.get(0))

        );

    }
    @Then("^she receives message the welcome page utest$")
    public void sheReceivesMessageTheWelcomePageUtest() {

    }
}
