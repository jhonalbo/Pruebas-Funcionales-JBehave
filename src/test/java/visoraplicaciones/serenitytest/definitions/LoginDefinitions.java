package visoraplicaciones.serenitytest.definitions;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.reports.html.ExampleTable;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import visoraplicaciones.serenitytest.steps.LoginSteps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("como usuario ingreso a la pagina de sahi")
    public void ingresarSitio(){
        loginSteps.ingresar();
    }

    @When("ingreso las credenciales:$logueo")
    public void ingresarDatosLogueo(ExampleTable Logueo){
        loginSteps.ingresarDatosLogin(logueo)
    }

    @Then("ingreso a la pagina principal del sitio")
    public void verificarIngreso(){

    }
}
