package tech.automation.api.stepdefinitions;

import io.cucumber.java.pt.*;
import io.restassured.response.ValidatableResponse;
import tech.automation.api.entidades.request.UsuarioRequest;
import tech.automation.api.rest.AutomationServiceApiTests;
import static org.hamcrest.Matchers.*;

public class CadastroUsuarioSteps {

    private UsuarioRequest usuarioRequest; 
    private ValidatableResponse response;
    private AutomationServiceApiTests api = new AutomationServiceApiTests();
    private String idUsuario;

    @Dado("que eu tenha dados validos para um novo usuario")
    public void queEuTenhaDadosValidosParaUmNovoUsuario() {
        this.usuarioRequest = UsuarioRequest.createDefault();
    }

    @Quando("eu envio a requisicao de cadastro")
    public void euEnvioARequisicaoDeCadastro() {
        response = api.doCadastrarUsuario(usuarioRequest); 
        idUsuario = response.extract().path("_id");
    }

    @Então("o usuario deve ser armazenado com sucesso")
    public void oUsuarioDeveSerArmazenadoComSucesso() {
        response.statusCode(201)
                .body("message", is("Cadastro realizado com sucesso"));
        
        api.doConsultarUsuarioPorId(idUsuario)
                .statusCode(200)
                .body("nome", is(usuarioRequest.getNome()))
                .body("email", is(usuarioRequest.getEmail()));
    }

    @Dado("que eu tenha dados de um novo usuario sem o campo e-mail")
    public void que_eu_tenha_dados_de_um_novo_usuário_sem_o_campo_e_mail() {
        usuarioRequest = new UsuarioRequest();
        usuarioRequest.setNome("Fulano de Tal");
        usuarioRequest.setPassword("teste123");
        usuarioRequest.setAdministrador("true");
    }

    @Então("a API deve retornar um erro de {string} com status {int}")
    public void a_api_deve_retornar_um_erro_de_com_status(String mensagemEsperada, Integer statusCode) {
        response.statusCode(statusCode);
        response.body("email", is(mensagemEsperada));
    }
}