package visoraplicaciones.serenitytest.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://sahitest.com/demo/training/books.htm")
public class LoginPages extends PageObject {

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[1]/td[2]/input")//se puede poner por xpath, css, id (refiere a componentes de la vista)
    WebElementFacade txtUsuario;

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[2]/td[2]/input")//se puede poner por xpath, css, id (refiere a componentes de la vista)
    WebElementFacade txtPassword;

    @FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")//se puede poner por xpath, css, id (refiere a componentes de la vista)
    WebElementFacade btnIngresar;

    public WebDriver driver;

    public loginPages(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void ingresarUsuario(ExamplesTable datos){
        txtUsuario.type(datos.getRow(0).get("usuario"));
    }

    public void ingresarPassword(ExamplesTable datos){
        txtUsuario.type(datos.getRow(0).get("contrasena"));
    }

    public void clicIngresar(){
        //Que se hace acá?txtUsuario.type(datos.getRow(0).get("usuario"));
    }


}
