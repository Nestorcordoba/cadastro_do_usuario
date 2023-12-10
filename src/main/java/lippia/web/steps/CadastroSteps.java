package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.CadastroService;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.Cadastro_de_usuarios_Constant.*;


public class CadastroSteps extends PageSteps {


    @Given("el usuario accede a la URL {string}")
    public void home(String url) {

       CadastroService.navegarWeb(url);
    }


    @Then("el usuario visualiza el elemento Nome")
    public void elUsuarioVisualizaLos() {
        Assert.assertTrue( ActionManager.waitPresence(ELEMENT_NOME).isDisplayed());
    }


    @And("el usuario visualiza el elemento E-mail")
    public void elUsuarioVisualizaElElementoEMail() {
        Assert.assertTrue( ActionManager.waitPresence(ELEMENT_EMAIL).isDisplayed() );
    }

    @And("el usuario visualiza el elemento Senha")
    public void elUsuarioVisualizaElElementoSenha() {
        Assert.assertTrue( ActionManager.waitPresence(ELEMENT_SENHA).isDisplayed() );
    }

    @And("el usuario visualiza el boton Cadastrar")
    public void elUsuarioVisualizaElBotonCadastrar() {
        Assert.assertTrue( ActionManager.waitPresence(BUTTON_CADASTRAR).isDisplayed() );
    }


    @When("El usuario ingresa el mail (.*)$")
    public void elUsuarioIngresaElMail(String email) {
        CadastroService.elUsuarioIngresaElMailJoaoSilvaEmailCom(email);
        CadastroService.clickEmailInput();

    }


    @When("El usuario ingresa la senha (.*)$")
    public void elUsuarioIngresaLaSenha(String senha) {
        CadastroService.elUsuarioIngresaSenha(senha);
        CadastroService.clickSenhaInput();
    }

    @And("El usuario presiona el boton Cadastrar")
    public void elUsuarioPresionaElBotonCadastrar() {
        CadastroService.clickButtonCadastrar();
    }
    
    @Then("valida que el campo nome no debe estar vacio")
    public void elCampoValidaQueNoDebeEstarVacio() {
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_NOME).isDisplayed() );

    }

    @When("El usuario ingresa el nombre (.*)$")
    public void elUsuarioIngresaElNombreJoaoDaSilva(String nombre) {
        CadastroService.elUsuarioIngresaNome(nombre);
        CadastroService.clickNomeInput();
        
    }


    @Then("valida que el campo email no debe estar vacio")
    public void validaQueElCampoEmailNoDebeEstarVacio() {
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_EMAIL).isDisplayed());
    }

    @Then("valida que el campo senha no debe estar vacio")
    public void validaQueElCampoSenhaNoDebeEstarVacio() {
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_SENHA).isDisplayed());

    }

    @Then("valida que todos los campos no deben estar vacio")
    public void validaQueTodosLosCamposNoDebenEstarVacio() {
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_NOME).isDisplayed() );
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_EMAIL).isDisplayed());
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_SENHA).isDisplayed() );
    }

    @Then("valida que el campo nome no debe estar incompleto")
    public void validaQueElCampoNomeNoDebeEstarIncompleto() {
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_NOME_COMPLETO).isDisplayed());
    }

    @Then("valida que el campo email es valido")
    public void validaQueElCampoEmailEsValido() {
        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_EMAIL_VALIDO).isDisplayed());
    }

    @Then("valida que la longitud de la senha es valido")
    public void validaQueLaLongitudDeLaSenhaEsValido() {

        Assert.assertTrue( ActionManager.waitPresence(VALIDATION_SENHA_VALIDA).isDisplayed());
    }

    @Then("valida registro exitoso")
    public void validaRegistroExitoso() {


        Assert.assertTrue( ActionManager.waitPresence(IDUSEREMAIL1).isDisplayed());




    }



    @When("el usuario ingresa el mail (.*)$")
    public void elUsuarioIngresaElMailJoaoSilvaMailCom(String mail3) {
        CadastroService.elUsuarioIngresaElMail(mail3);
    }


    @When("el usuario ingresa  el mail(.*)$")
    public void elUsuarioIngresaElMailNestorcordobaMailCom(String mail4) {

        CadastroService.elUsuarioIngresaElMail(mail4);
    }

    @And("El usuario remueve el ultimo registro")
    public void elUsuarioRemueveElUltimoRegistro() {

        CadastroService.clickButtonRemove();

    }



    @Then("valida registro exitosodos")
    public void validaRegistroExitosodos() {
        Assert.assertTrue( ActionManager.waitPresence(IDUSEREMAIL1).isDisplayed());
        Assert.assertTrue( ActionManager.waitPresence(IDUSEREMAIL2).isDisplayed());
    }
}