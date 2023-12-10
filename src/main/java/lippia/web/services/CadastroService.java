package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.Cadastro_de_usuarios_Constant;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class CadastroService extends ActionManager {

    public static void navegarWeb(String url){
        navigateTo(url);
    }

    public static void elUsuarioIngresaElMailJoaoSilvaEmailCom(String text1) {
        setInput(Cadastro_de_usuarios_Constant.INPUT_EMAIL, text1);
    }

    public static void clickEmailInput() {
        click(Cadastro_de_usuarios_Constant.INPUT_EMAIL);
    }

    public static void elUsuarioIngresaSenha(String text1) {
        setInput(Cadastro_de_usuarios_Constant.INPUT_SENHA, text1);
    }

    public static void clickSenhaInput() {
        click(Cadastro_de_usuarios_Constant.INPUT_SENHA);
    }

    public static void elUsuarioIngresaNome(String text3) {
        setInput(Cadastro_de_usuarios_Constant.INPUT_NOME, text3);
    }

    public static void clickNomeInput() {
        click(Cadastro_de_usuarios_Constant.INPUT_NOME);
    }

    public static void clickButtonCadastrar() {
        click(Cadastro_de_usuarios_Constant.BUTTON_CADASTRAR);
    }

    public static void elUsuarioIngresaElMail(String text1) {
        setInput(Cadastro_de_usuarios_Constant.INPUT_EMAIL, text1);
    }

    public static void clickButtonRemove() {
        click(Cadastro_de_usuarios_Constant.REMOVEUSER2);
    }


}
