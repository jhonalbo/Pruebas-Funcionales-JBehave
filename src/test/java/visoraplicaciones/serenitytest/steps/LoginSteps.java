package visoraplicaciones.serenitytest.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import visoraplicaciones.serenitytest.pages.LoginPages;
import org.jbehave.core.model.ExamplesTable;

public class LoginSteps extends ScenarioSteps {

    LoginPages loginPages = new LoginPages(getDriver());

    public LoginSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresar(){

    }

    @Step
    public ingresarDatosLogin(ExamplesTable datos){
        loginPages.ingresarUsuario(datos);
        loginPages.ingresarPassword(datos);
        loginPages.clicIngresar();
    }
}
