package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStep {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa a buscar la cuenca en reniec")
    public void ingresaSusCredencialesDeAdmin() {
        System.out.println("sr");
    }
    @Then("me muestra el {string} de la aplicacion")
    public void meMuestraElDeLaAplicacion(String string) {
        System.out.println("dsaf");
    }

}
